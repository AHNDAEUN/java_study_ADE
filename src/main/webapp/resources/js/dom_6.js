//dom_6.js


//button에 click event 등록
const btn = document.getElementById("btn");// btn태그
const d1= document.getElementById("d1"); //div 태그
const add = document.getElementById("add");
const list =document.getElementById("list");
const add2 =document.getElementById("add2"); // gtn
const list2 =document.getElementById("list2"); //ol
const add3 =document.getElementById("add3");
const d2= document.getElementById("d2");
const d3= document.getElementById("d3");
const add4 =document.getElementById("add4");
const add5 =document.getElementById("add5");

btn.addEventListener("click",function(){

console.log("실행");
d1.innerHTML= '<img src="/resources/images/KakaoTalk(2)jpg.jpg">'
//inner은 기존에 있던 것에 덮어씌우기
});

add.addEventListener("click",function(){

   // list.append('<li>test<li>')

   let li = document.createElement("li");// <li><li/>생성
   list.append(li);// 만들어진 li 태그를 추가(append) 시킴

   let t =document.createTextNode("test");// 문자열 test 생성
    list.appendChild(t); // <li>child</li>
})


add2.addEventListener("click" ,function(){

    //ol태크 내에 child 준비
    let li = document.createElement("li"); // <li></li>
    let h = document.createElement("h3"); //<h3></h3>
    let t =document.createTextNode("hello")//hello
    h.appendChild(t); //<h3>hello</hello>
   li.appendChild(h)  //<li><h3>hello</hello></li>
   list2.prepend(li)


    //자식목록 중 제일 위에 추가
})

//add3을 클릭하면 div#d2, 내에 input Element를 Append

add3.addEventListener("click", function(){

    let input =document.createElement("input"); //<input>
    let ch = document.createAttribute("type");// type=
    ch.value="checkbox";                      //type="checkbox" 부모자식이 아닌 속성값임
    input.setAttributeNode(ch);               // <input type="checkbox">  
    d2.appendChild(input);



})


//add4을 클릭했을때  div id가 d3의before 적용
add4.addEventListener("click",function(){

let h= document.createElement("h3");
let b = document.createTextNode("b4");
d3.before(h);
h.appendChild(b)

})

//add5를 클릭하면 div#d3 after:<h3>atfer</h3>

add5.addEventListener("click", function(){

    let h = document.createElement("h3")
    let a = document.createTextNode("after")

    h.appendChild(a);
    d3.after(h);
})