let users= require('./user');
let fs = require('fs');
const { isBuffer } = require('util');
//fs.readFileSync("user.json")
fs.readFile("user.json",function (err,data){
    if(err){
        console.log("there is an error");
    }
    
         users= JSON.parse(data);
        console.log(users);
    
});

let newusers = {
    name: "charles", age : 24
};
users.push(newusers);

fs.writeFile("user.json", JSON.stringify(users),err=>
{
    if(err) throw err;
    console.log("doen writting");
});


