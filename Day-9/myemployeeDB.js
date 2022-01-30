let app = require("express")();
let mysql = require('mysql').mysql;
let dbURL = "myemployeedb://localhost:9091";
let port = 8091;
app.listen(port, () => console.log(`Node server running in ${port}`));
// retriving all the records
app.get('/employee', (request, response) => {
    mysql.connect(dbURL, {useNewUrlParser : true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            let doc = myDB.collection("employee").find();
            let arrayOfRecords = [];
            let x = 0;
            doc.forEach((record) => {
                arrayOfRecords.push(record);
                x++;
            }, () => {
                if(x == 0) {
                    response.json({error: "No records found!"})
                } else {
                    response.json(arrayOfRecords);
                }
                client.close();
            });
        } // end of if
    }); // end of connect()
});


// retrieving a particular record using employee/:id
app.get('/employee/:id', (request, response) => {
    let id = parseInt(request.params.id); //client sends id in path it will be string
    //connect to the database MongoClient.connect(url, parser, callback);
    mysql.connect(dbURL, {useNewUrlParser: true}, (err, client) => {
        if(!err) {
            let myDB = client.db('mydb');
            //db.collectionName.find();
            let doc = myDB.collection("employee").find({_id: id});
            
            let x = 0;
            // doc.forEach(callbackIteration, callbackIterationEnds)
            doc.forEach((record) => {
                x++;
                response.json(record);
            }, () => {
                if(x == 0) {
                    response.json({error : `Sorry id ${id} is not found`});
                }
                client.close();
            }); // forEach() end
        } // if ends
    });// connect ends
});// get() ends
app.delete('/employee/:id',(request,response)=>{
    let id = parseInt(request.params.id);
    console.log(`id is ${id}`)
    connection.query(`delete from employee where id=${id}`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
      });
});

app.post('/employee',(request,response)=>{
    console.log(request.body);
   
    let requestBody = request.body;
    
    let name = requestBody['name'];
    let salary = requestBody['salary'];
    console.log(`name = ${name} and salary = ${salary}`);
    connection.query(`INSERT INTO employee (name,salary)VALUES('${name}','${salary}')`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
      });
    
});
app.listen(port, ()=> console.log(`listining to ${port}`));
