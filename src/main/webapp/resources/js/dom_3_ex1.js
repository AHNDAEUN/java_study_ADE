//dom_3_ex1

// 1. element id  (가지고 올 엘리먼트 선택)
const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
const d3 = document.getElementById("d3");
const btn =document.getElementById("btn");
// 숫자를 보내도 서버에서 문자열로 받음 (=parameter)

// 2. event 등록
btn.addEventListener("click", function(){
    console.log("event 실행"); //1) 이벤트가 실행되는지 확인
    console.log(d1.value); //2) 값이 가져와지는지 확인
    console.log(d2.value); 
    d3.value= d1.value*1+d2.value*1; //3. d1*d2을 연산해서 d3에 넣어주기
});                             //"+","-" 경우 문자열을 합쳐주는 의미로 사용됨, 나머지 연산자는 숫자로 계산됨
                                // value뒤에 *1을 붙여서 문자-> 숫자로 변환 

// function test(){ // 선언
//     alert("click Event 실행");
//     let result = test2(1,2);
//     console.log(result);

// }
// function test2(d1,d2){
//     let result= d1*d2;

//     return result;
    
// } 


//------------------------------------------

const btn2 =document.getElementById("btn2");
const btn3 =document.getElementById("btn3");


btn2.addEventListener("click", function(){
alert("btn2");

});

btn3.addEventListener("click",function(){// btn3을 클릭시 btn2을 강제발생
btn2.click();

});