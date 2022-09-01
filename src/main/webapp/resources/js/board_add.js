//board_add.js
// 파일추가


const addFiles = document.getElementById("addFiles");
const add = document.getElementById("add");


add.addEventListener("click", function(){
//     <label for="files" class="form-label">File</label>
//     <input type="file" name="files" class="form-control" id="files">
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


    addFiles.append(div);


})