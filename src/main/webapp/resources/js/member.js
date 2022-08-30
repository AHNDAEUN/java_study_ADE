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
});