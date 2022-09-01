function loginckeck(){
const btn= document.getElementById("btn");
const login= document.getElementById("login");

btn.addEventListener("click", function(){
    console.log("submit button click");
    login.submit();
}); 


//-------------------------------------------
// 로그인 비밀번호 칸에 글이 있으면 넘기고 안넘기면 없음

const id = document.getElementById("id");
const pw = document.getElementById("pw");





    btn.addEventListener("click", function(){

    let i= id.value;  
    let p= pw.value;    
   console.log(i);
   //console.log(i==null);
   console.log(i=="");
   console.log(i.length);

   if(i==""){
    alert("id는 필수 입니다.");
    return; // 메서드내에서 리턴을 만나면 그즉시 중단
   }

   if(p==""){

    alert("pw는 필수 입니다.")
    return;
   }

//    if(p.length>0 && p.length>0 ){
//       login.submit();
//    }else{
//         alert("id와 pw는 필수 입니다.");
//    }
// login.submit();
});
}

function check(){

    const all =document.getElementById("all");
    const cb =document.getElementsByClassName("cb");
    const join =document.getElementById("join");
    const frm =document.getElementById("frm");
    const req =document.getElementById("req");

    join .addEventListener("click",function(){
        
     if(all.checked){

         frm.submit(); //전체동의 필수인 경우

         }else{
          alert("약관 동의해주세요!!");
         }
    })


all.addEventListener("click",function(){

    for(let i=0; i<cb.length; i++){
        cb[i].checked =all.checked;
    }
});


for(let i=0; i<cb.length;i++){

    cb[i].addEventListener("click",function(){
        let result=true;
        for(let j=0; j<cb.length;i++){

            if(!cb[j].checked){

                result =false;
                break;
            }

        }
        all.checked=result;
    })
}
}