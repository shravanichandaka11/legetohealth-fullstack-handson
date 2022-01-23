let fs = require('fs');
let text = "this a simple text\n"
fs.writeFile('msg.txt', ' writing in asynchronous manner \n', {flag:'a+'},(err)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log("file written");
    }
});