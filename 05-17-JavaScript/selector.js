console.log('hello');
let title = document.getElementById('title');
console.log(title);
title.textContent = '헬스 3대 운동';
//id선택자에 쓰여진 텍스트 수정할 때 사용

let items = document.getElementsByClassName('item');
//id는 변수로 받지만 class는 배열로 받아들인다.(Element's'->요소가 여러개라는 뜻)

console.log(items);
console.log(items[0]);
console.log(items[1]);
console.log(items[2]);

let lilist = document.getElementsByTagName('li');
console.log(lilist);
//위에서는 id 클래스 태그를 찾은 것이지만 선택자도 찾을 수 있다.
//querySelector(선택자를 찾아내는 것)
let h2 = document.querySelector('#title');
console.log("h2: ",h2);

let item = document.querySelector('.item');
console.log('query item',item);
let itemAll = document.querySelectorAll('.item');
console.log('itemAll: ',itemAll);
console.log('itemAll[0]: ',itemAll[0]);
console.log('itemAll[1]: ',itemAll[1]);
console.log('itemAll[2]: ',itemAll[2]);

