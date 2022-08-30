//1. 선택자


// const d1=document.getElementById("di");
// //alert(d1.value);
// //alert(d1.getAttribute("value"));

// const d2 =document.getElementById("d2");
// d2.type="button";
// d2.setAttribute("type","button");

// const d3 = document.getElementById("d3");
// let count= window.prompt("숫자를 입력하세요");
// let t= "";

// for(let i=0; i=count; i++){ 
//         t=t+'<input type= "text">';
//    // d3.innerHTML='<input type="text">';
// }


const year = document.getElementById("year");
let y ="";

for (let i=2022; i>=1900; i--){
    y=y+'<option>'+i+'</option>'

}

year.innerHTML=y;

const d4= document.getElementById("d4");

let r= prompt("row 갯수 입력");//3
let c =prompt("col 갯수 입력");//2

let table="";

for (let i=0; i<r; i++){

    table=table+'<tr>';

    for (let j=0; j<c; j++){
        table=table+'<td>'+i+j+'</td>';
    }
    table =table+'<tr>';
}
d4.innerHTML=table;