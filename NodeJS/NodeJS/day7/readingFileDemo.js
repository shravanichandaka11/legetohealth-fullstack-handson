let fs =require('fs')
//reads file synchronously
let data= fs.readFileSync("simple.txt")
let content = data.toString();
console.log(content);
