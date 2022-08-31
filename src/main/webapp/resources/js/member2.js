
//member2
//선택자
const d1 =document.getElementById("d1");
const pw1 =document.getElementById("pw1");
const pw2 =document.getElementById("pw2");
const name =document.getElementById("name");
const email =document.getElementById("email");
const num =document.getElementById("num");
const joinform = document.getElementById("joinform");
const joinbutton =document.getElementById("joinbutton");


//메세지
const d1result= document.getElementById("d1result");

//check결과 변수 확인
let idcheck= false; // 초기값 설정해서 못넘어가게함
let pwckeck=false;
let pwequalcheck=false;
let nameckeck=false;
let emailcheck=false;
let phonecheck=false;

joinbutton.addEventListener("click",function(){
if(idcheck&&pwckeck&&pwequalcheck&&nameckeck&&emailcheck&&phonecheck){
    joinform.submit;

}else{
    alert("필수 입력 사항은 다 입력");
}

});

d1.addEventListener("blur", function(){
        idcheck=false;
    console.log("실행");
    if(d1.value.length>1){
        d1result.innerHTML="";
        idcheck=true;
    }else{
        //1. idcheck=false;

        d1result.innerHTML="id는 최소 2글자 이상이어야 합니다.";
    }
})

d1.addEventListener("blur", function(){

    console.log("blur 실행");


let d= d1.value;
if(d.length<2){
    console.log("ID는 2글자 이상이어야 합니다.");
    d1.focus();
   
}

})

pw1.addEventListener("blur",function(){

let p=pw1.value;

if(p.length<=6){
    alert("비밀번호는 최소 6글자 이상이어야 합니다.");
    pw1.focus();

}

});

pw2.addEventListener("blur",function(){

    if(pw1==pw2){

        alert("비밀번호가 일치합니다.");
    }else{

        alert("비밀번호가 일치하지 않습니다. 확인해주세요");
    }
});

name.addEventListener("blur",function(){
    let n=name.value;
    if(n.length<=1){
        
        name.focus();
        alert("이름 입력은 최소 1글자 이상이어야 합니다.");  
    }
})

email.addEventListener("blur",function(){
    let e=email.value;
    if(n.length<=1){
        
        email.focus();
        alert(" 메일 형식으로 다시 입력해주십시오. ");  
    }
})

num.addEventListener("blur",function(){
    let m=num.value;
    if(n.length<=1){
        
        num.focus();
        alert("전화번호 입력은 최소 1글자 이상이어야 합니다.");  
    }
})
