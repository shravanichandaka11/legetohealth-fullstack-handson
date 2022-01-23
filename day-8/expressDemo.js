//const { request, response } = require("express");

let app = require("express")();
let bodyParser = require('body-parser')
let port = 9090;
app.use([bodyParser.text(),bodyParser.json()]);
app.get('/employee/:id', (request, response) => {
    console.log(request.param.id);
    let employee = {id:100, name :"Alex",Salary: 25000};
    response.json(employee);
});
app.post('/employee', (request, response) => {
   console.log(request.body);
   let content = request.body;
   response.json(content);
 });
 app.put('/', (request, response) => {
    let employee = {id:101, name :"Arun",Salary: 24000};
    response.json(employee);
});
app.delete('/', (request, response) => {
    let employee = {id:100, name :"Arun",Salary: 24000};
    response.json(employee)
 });
app.listen(port, () => console.log(`listening to port ${port}`));
