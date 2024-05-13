// function myfunc1() {
//   // var와 let의 변수 키워드 차이
//   var Var1 = 10; //함수 스코프(함수 범위 안에서 사용)
//   let Let1 = 20; //블록 스코프(블록 범위 안에서 사용)
//   console.log(Var1);
//   console.log(Let1);
//  Var1 = 30; //같은 이름의 var 변수 재선언 가능
//  Let1 = 40; //같은 이름의 Let 변수 재선언 불가능
//   console.log(Var1); //30 출력
//   console.log(Let1); //에러발생
// }
// myfunc1(); //위의 함수를 선언하고 정의한 함수를 호출
// //console.log(Var1); 함수 범위를 벗어났기 때문에 에러 발생함
// //console.log(Let1);
// function myfunc2()
// {
//     var Var2 = 10;
//     var Var2 = 20;
//     console.log(Var2);
// }
// myfunc2();
// function myfunc3()
// {
//     //console.log(Var4);
//     //var Var4 = 100;
//     console.log(Let3);
//     let Let3 = 100;
// }
// myfunc3();
var num1 = 15;
var num2 = 2;
var result;
result = num1 + num2;
document.write(result, "<br>"); // 17
result = num1 - num2;
document.write(result, "<br>"); // 13
result = num1 * num2;
document.write(result, "<br>"); // 30
result = num1 / num2;
document.write(result, "<br>"); // 7.5
result = num1 % num2;
document.write(result, "<br>"); // 1
