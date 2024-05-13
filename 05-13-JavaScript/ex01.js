var box = 100; //변수 선언과 동시에 초기화하는 방법을 많이 사용한다.
document.write('box값:', box, '<br>');
box = 30;
document.write('box값:', box, '<br>'); //30

var s = 'javascript';
console.log(s);
var num = '100';
console.log(num);

var t = Number('500');
console.log(t);
var s1 = true;
console.log(s1);
var t1 = 10 >= 100;
console.log(t1);
var k1 = Boolean('Hello');
console.log(k1);

var a = true;
var b = false;
var c = 10 > 5;
var d = Boolean(null);

document.write(a, "<br>");
document.write(b, "<br>");
document.write(c, "<br>");
document.write(d, "<br>");

var num = 100;
var str = "자바스크립트";
document.write(typeof num, "<br>");
document.write(typeof str);

let num1 = 100.5;
let str1 = "자바스크립트";
document.write(num1, "<br>");
document.write(str1);