

function bubbleSort(array) {
  for (let i = 0; i < array.length - 1; i++) {
    for (let j = 0; j < array.length - i - 1; j++) {
      if (array[j] > array[j + 1]) {
        [array[j], array[j + 1]] = [array[j + 1], array[j]];
      }
    }
  }
  return array;
}

/* const 사용 시점:

값이 변경되지 않는 변수 선언(예: PI, 파일 경로)
변수 값 변경을 방지하여 코드 오류 방지
명확하고 읽기 쉬운 코드 작성
const vs let;
let 키워드는 블록 범위 변수를 선언하는 데 사용되지만, const와 달리 값을 변경할 수 있습니다.*/
const numbers = [5, 2, 4, 7, 1, 3, 8, 6];
const sortedNumbers = bubbleSort(numbers);
console.log(sortedNumbers); //[1,2,3,4,5]처럼 오름차순으로 정렬된다.
