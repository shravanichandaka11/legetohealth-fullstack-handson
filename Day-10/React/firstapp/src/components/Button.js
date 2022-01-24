import React, {Component} from 'react'
export class Simple extends React.Component{
handleButton = (event)=>{
    console.log("Handled Button Event!!");
    console.log(event);
}
    render(){
        return(<div>
            <button onClick={this.handleButton}>Second Button</button>
            <button onClick={(event)=>{console.log(event)} }>Simple Button</button>
        </div>)
    }
}


export function Input(){
    return(
        <div>
            <input type= 'text' onChange={(event)=> {console.log(event)}}></input> 
            <button onClick={(event)=> {console.log(event);}}>Second  Click</button>

        </div>
    )
}
function Button(){
    let handleClick = (event)=>{
        console.log(event);
    }
    return(
        <div>
           <button onClick={ handleClick}> CLick Button</button> 
        </div>
    )
}

export default Button;