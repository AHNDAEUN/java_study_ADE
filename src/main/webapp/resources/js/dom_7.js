
//dom_7.js
//remove1을 눌렀을때 d1 지우기

const remove1 = document.getElementById("remove1");
const remove2 = document.getElementById("remove2");
const d1 = document.getElementById("d1");
const d2 = document.getElementById("d2");
//const d2_1 = document.getElementById("d2_1");
//const c = document.getElementsByClassName("c");

remove1.addEventListener("click",function(){
// 삭제
d1.remove();

})


//자식 태그 지우는 방법
// remove2.addEventListener("click", function(){

//     //d2.removeChild(d2_1);

// })



remove2.addEventListener("click",function(){

    const c = document.getElementsByClassName("c");
      const ar= [];
      
    //1. for (데이터탑입 변수명 : 컬렉션 변수명)
    // for(cc of c){
    //         d2.removeChild(cc);}

    //2.  for(let i=0; i<c.length;i++){
    //     d2.removeChild(c[i]);
    // }

    for(let i=0; i<c.length;i++){
        ar.push(c[i].id);
    }

    for (i of ar){
        let d =document.getElementById(i);
        d2.removeChild(d);
    }
        

})


// id만 꺼내 올 경우
// remove2.addEventListener("click",function(){
//     for(let i=0; i<5; i++){
//     const d2_1 = document.getElementById("d2_1"+i); //id를 상수로 쓰지 않고 문자열로 돌릴 수 있음
//         d2.removeChild(d2_1);
// }
// })