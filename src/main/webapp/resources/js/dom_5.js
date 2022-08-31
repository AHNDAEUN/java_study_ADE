const d2 =document.getElementById("d2");
const d1 = document.getElementById("d1");
const d3 =document.getElementById("d3");
const d5 = document.getElementById("d5");
const d4 = document.getElementById("d4");

//d2.focus;

d2.addEventListener("focus",function(){
    console.log("입력 준비 상태");
});

d2.addEventListener("blur", function(){


    console.log("blur 발생");
})


//d1에 입력을 하고 나왔을때 글자의 길이가 3글자 이하라면
//d1에 강제로 다시 입력 대기상태

d1.addEventListener("blur", function(){

    let v= d1.value
    if(v.length<4){

     d1.focus();   
    }

})

d3.addEventListener("change", function(){

    console.log("change 이벤트발생");

});

d5.addEventListener("change", function(){
    console.log("SELECT 변경");
})

// function keyup(){
// d4.addEventListener("keyup",function(){

//     console.log("keyup 실행");
//     let result =0;
//     let c = d4.value;

//     if(c){
//       result= d4*1000;

//       return result;
//     } 
// });

//}