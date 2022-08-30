//dom_3.js

const d1 =document.getElementById("d1");
d1.innerHTML='hello';

//java 메서드 
//접근지정자 {그외 지정자} 리텁타입 메서드(){}
//function 함수명(){}

function test(){ // 선언
    alert("click Event 실행");
    let result = test2(1,2);
    console.log(result);
    f1();
}
//이름있는 함수
function test2(num1, num2){
    let result = num1+num2;
    return result;
}

// test2안에 있는 매개변수를 받아서 result값으로 더해 리턴함

// 익명함수 - 함수명이 없는 함수
 let f1 =function(){
    console.log("익명함수 실행");
}

//--------------------------------
const d2= document.getElementById("d2");

//event 적용1

//d2.onclick =test; // 호출 ()를 빼면 바로 실행이 아닌 나중에 실행
// d2에 클릭이벤트를 걸어두고 클릭했을때 테스트 함수 실행

// d2.onclick= f1; ()생략
d2.onclick= function(){
 console.log("click 콜백함수 실행"); 
}; 


const btn1 =document.getElementById("btn1");

//event 적용
//btn1.addEventListener("click",f1);
btn1.addEventListener("click",function(){
    console.log("eventlistener");
});