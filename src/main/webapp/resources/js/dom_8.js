//dom_8.js

const count = document.getElementById ("count");
const btn = document.getElementById("btn");
const result =document.getElementById("result");
const d1 =document.getElementById("d1");
const d1_1 = document.getElementById("d1_1");
const d1_1_1 = document.getElementById("d1_1_1");
const google = document.getElementById("google");


google.addEventListener("click",function(event){

    alert("GO GOOGLE");
    event.preventDefault();
});

d1.addEventListener("click",function(event){

    console.log("d1 click")
    console.log(event);
    console.log(event.target);
    //target- 실제 클릭한 영역
    console.log(event.currentTarget)
    if(event.target.className=='buttons'){
        alert("button");
        console.log("this: ",this);
        // this는 부모영역
        alert(event.target.innerHTML);
        //부모영역에서 실제 클릭한 영역
    };
},false);


//--------------------------------
result.addEventListener("click", function(event){

    if(event.target.className=='c1'){

        alert(event.target.innerHTML);
    }
})






btn.addEventListener("click",function(){
// 버튼 태그 생성 
for (let i=0; i<count.value;i++){
    console.log("실행");

 let b= document.createElement("button");
 let t = document.createTextNode("Click"+i);
 b.appendChild(t)
 let c =document.createAttribute("class");
 c.value="c1";
 b.setAttributeNode(c);

result.append(b);
}
})


//c1을 클릭했을때 contents 내용을 alert창에 띄우기
const c1= document.getElementsByClassName("c1")
//class 는 배열이기 때문에 for문 후 addEventListener를 적용
for (c of c1){

    c.addEventListener("click",function(){
        alert(c.innerHTML);
    })
}

