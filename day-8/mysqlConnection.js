let app= require("express")();
let mysql = require('mysql');
//let mySqlUrl= "sqldb://localhost:mysql";

let bodyParser = require('body-parser');
let con = mysql.createConnection({
    host:"localhost", user:"root",password:"root",
    database: "myEmployeeDb"
   
});
let port = 9090;
app.listen(port, () => console.log(`Node server running in ${port}`));
app.use([bodyParser.text(),bodyParser.json()]);
app.get('/employee', (request, response) => {
 con.connect((err)=>{
     let id = parseInt(request.params.id);
     con.query("SELECT * FROM employee",function(err,result){
         if(err) throw err;
         console.log(result);
         response.json(result);
     });
   
    });
});
app.get('/employee/id', (request, response) => {
    let id = parseInt(request.params.id);
    con.connect((err)=>{
        let id = parseInt(request.params.id);
        con.query("SELECT * FROM employee WHERE id = `${id}`",function(err,result){
            if(err) throw err;
            console.log(result);
            response.json(result);
        });
      
       });
   });
    app.put('/', (request, response) => {
        
        let sql= "INSERT INTO employee(id, name,age) VALUES?";
 var values = [
     ['4','Ram','27'],
     ['5','Aryan','26'],
     ['6','Arun','25']

 ];
con.query(sql, [values],function(err,result ){
    if(err) throw err;
    console.log(result);
    response.json(result);
});
            
        });
        
   
    app.delete('/employee/id', (request, response) => {
        let id = parseInt(request.params.id);
        con.query("DELETE FROM employee WHERE id= `${id}`",function(err,result){
            if(err) throw err;
            console.log(result);
            response.json(result);
        });
        
     });
 

    
