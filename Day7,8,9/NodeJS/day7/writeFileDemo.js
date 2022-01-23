let fs = require('fs')
let text = " this ssimple text\n"
fs.writeFileSync('msg.txt', text,{flag: 'a+'})
console.log("done !!");