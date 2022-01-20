const { request, response } = require("express");

let app =require("express")();
let port = 9090;
app.get('/', (request,response)=>{
    response.send('get requets form/')
});
app.post('/', (request,response)=>{
    response.send('post requets form/')
});
app.put('/', (request,response)=>{
    response.send('put requets form/')
});
app.delete('/', (request,response)=>{
    response.send('delete requets form/')
});
app.listen(port, ()=> console.log(`listening to port ${port}`));
