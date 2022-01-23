 //importing http module
let http = require("http");
let port =8081;

let Server = http.createServer( (req,res) => {
// 200 is success status code 
//text/html identifies the context as html 
// if wee give text/plain it identifies as plain text then <h2></h2> willalso printed
    
//console.log(req);
res.writeHead(200,{'content-Type': 'text/html'})

    res.write("<h2>welcome back node web!!!</h2>");
    res.end()
});
Server.listen(port,() => console.log(`server started in ${port}`));

console.log('server running at http:// 127.0.0.1:9090');