let app= require("express")();
let mysql = require('mysql');
//let mySqlUrl= "sqldb://localhost:mysql";

let bodyparser = require('body-parser');
let con = mysql.createConnection({
    host:"localhost", user:"root",password:"root",
    database: "myEmployeeDb"
   
});
let port = 9090;
app.listen(port, () => console.log(`Node server running in ${port}`));
app.get('/employee', (request, response) => {
 con.connect((err)=>{
     let id = parseInt(request.params.id);
     con.query("SELECT * FROM myEmployeeDb",function(err,result){
         if(err) throw err;
         console.log(result);
         response.json(result);
     });
   
    });
   /* con.query("CREATE DATABASE myEmployeeDb", function(err,result)
    {
        if(err){
            console.log("databse not created");
        } 
        console.log("database created");
    });*/
/*var sql = "CREATE TABLE employee(id INT  , name VARCHAR(255), age INT)";
con.query(sql, function(err,result){
    if(err){
        console.log("table not created");
    }else{
        console.log("tabel created");
    }
});
con.query( " SELECT * FROM employee",function(err,result, fields){
    if(err){
        console.log("no records found");
    }
    console.log(result);
});*/

/*let sql= "INSERT INTO employee(id, name,age) VALUES?";
 var values = [
     ['1','alex','27'],
     ['2','Arun','26'],
     ['3','Arjun','25']

 ];
con.query(sql, [values],function(err,result ){
    if(err){
        console.log("Insertion  not created");
    }else{
        console.log("Insert created");
    }
});*/
/*var sql = "UPDATE employee SET age ='26' WHERE id='1'";
con.query(sql,function(err,result){
    if(err){
        console.log("not updated");
    }
    console.log(result.affectedRows + " record updated");
});*/
 }); 

    
