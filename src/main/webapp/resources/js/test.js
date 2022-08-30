// javascript 설명 예제

//alert("welcome");

//1
//java: int num=1;

var num=1;
num ='abc';


let num2 ='1';
console.log(num==num2);
console.log(num===num2);

for(var i=0; i<10; i++){

    console.log(i);
    count=1;
}

console.log('==============');
//console.log(i);
 //i는 지역변수이기 때문에 for 문 밖에서 사용했을때 에러가 뜸
console.log(count); 
 console.log('------------');



 let ar =['4',1,3,'2'];
 
 console.log(ar[0]);
 console.log(ar[1]);

 ar.push(5); // 끝에 넣어줌
 console.log(ar);

 ar.unshift(3);
 console.log(ar);

 ar.sort();
 console.log(ar); // 오름차순 작은순-> 큰순
 ar.reverse();// 역순 내림차순 큰순-> 작은순
 console.log(ar);

 //ar.forEach(function(v(배열에서 꺼낸 값),i(인덱스 번호),ar){
    ar.forEach(function(v,i,ar){
        console.log("v:",v);//"v :"+v
        console.log("i: ",i);
        console.log('----------');

    });