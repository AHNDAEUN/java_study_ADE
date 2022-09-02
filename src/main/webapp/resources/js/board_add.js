//board_add.js
// 파일추가


const addFiles = document.getElementById("addFiles");
const add = document.getElementById("add");

let count =0;


add.addEventListener("click", function(){
      
   count++;
  
   if(count>5){

      alert("최대 5개만 가능")

      return;
   }
   
  
//     <label for="files" class="form-label">File</label>
//     <input type="file" name="files" class="form-control" id="files">
//  * 버튼 추가 <button type= "button" class="del"> 삭제 </button>
//   </div>
   
   //부모 Element div 생성
    let div =document.createElement("div");//<div></div>
    let c =document.createAttribute("class");// class=""
    c.value="mb-3" // class="mb-3"
    div.setAttributeNode(c); //<div> class="mb-3" </div> 
   
 //   addFiles.append(div);


    // 자식 Element Label 생성
    let label = document.createElement("label"); //<label> </label>
    let labeltext= document.createTextNode("file"); //"File"
    label.appendChild(labeltext);// <label>File</label>
   
    let labelclass = document.createAttribute("class");//class=""
    labelclass.value="form-label";
    label.setAttributeNode(labelclass);  // 
    labelclass= document.createAttribute("for"); //for="";
    labelclass.value="files";
    label.setAttributeNode(labelclass);

    div.appendChild(label);


     // 자식 Element Input 태그 생성
    let i = document.createElement("input");
    let t = document.createAttribute("type")
    t.value="file";
    i.setAttributeNode(t);
    addFiles.appendChild("i");


    t=document.createAttribute("name");
    t.value="files";

    i.setAttributeNode(t);

    t=document.createAttribute("class");
    t.value="form-control";

    i.setAttributeNode(t);

    t=document.createAttribute("id");
    t.value="files";
    i.setAttributeNode(t);

    div.appendChild(i)
    
    
    // 삭제버튼 생성
    let b= document.createElement("button")
    let bc= document.createTextNode("삭제")
    b.appendChild(bc)

    let ty= document.createAttribute("type")
    ty.value="button";
    
    b.setAttributeNode(ty)
    
    
    ty=document.createAttribute("class")
    ty.value="del";
    b.setAttributeNode(ty)

    ty=document.createAttribute("title")
    ty.value=idx;
    b.setAttributeNode(ty);

    div.appendChild(b);

    addFiles.append(div);
 
count++;
   idx++;

})


addFiles.addEventListener("click",function(event){

   let button =event.target; // button
   if(button.target.classList[0]=='del'){
     
         //속성명을 가져오는 것은 속성명을 쓰거나 getAttribute();
   document.getElementById("file"+button.title).remove();
      count--;

}


})
