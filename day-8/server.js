let app =require('express')();
const { response } = require('express');
let http = require('http')
let io = require('socket.io')(http)
app.get('/',(request,response)=>{
response.sendFile(-__dirname+ 'client.html')
}).listen(9090);
 //http.isten(9090,()=>{     console.log("server running at 9090"); });
io.on('connection',(socket)=>{
    console.log("socket is connected" + socket.connected);
    socket.on("client message " ,(msg)=>{
        socket.emit("message key",msg);
    });
});