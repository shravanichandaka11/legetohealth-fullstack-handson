let util ={
    store: function(name, age){
        console.log(`Stored name :${name}, age: ${age}` );
        
    }, 
    find : function(name){
        console.log(`finding  :${name}`);
    }
 
}
module.exports=util;
