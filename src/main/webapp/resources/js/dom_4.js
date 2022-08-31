const ch= document.getElementsByClassName("ch");
// 배열에는 이벤트를 걸 수 없기 때문에 하나씩 꺼내서 걸어줘야함
//엘리먼트에만 이벤트를 걸 수 있다
for(let i=0; i<ch.length; i++){

    ch[i].addEventListener("click", function(){

       alert(ch[i].value); 
    });
}

const all =document.getElementById("all");
console cb =document.getElementsByClassName("cb");

all.addEventListener("click",function(){

    console.log(all.Checked);
    for(let i=0; i<cb.length; i++){
        cb[i].Checked =all.Checked;
    }

});

for (let i=0; i<cb.length; i++){
    // cb[i].addEventListener("click",function(){

    //     Check(1)});

    cb[i].addEventListener("click",ckeck);
 };

function ckeck(num){
    for (let i=0; i<cb.length; i++){
        console.log(cb[i].Checked);
    }
}

function ckeck(){
    let result =true;
    for (let i=0; i<cb.length; i++){
        if(!cb[i].Checked){
            result=false;
            break;
        }
    }
    all.Checked=result;
}