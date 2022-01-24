import React, {Component} from 'react'
export class MyData extends React.Component{
    constructor(props){
        super(props);
        this.state= {name:''};
    }
     handleName = (event)=> {
        this.setState({name: event.target.value });
     }

    render(){
        return(<div>
            <h1>Enter Your details</h1>
            <input type='text' onChange ={this.setState({name: event.target.value })}>Name</input>
            
          
        </div>)

    }

}
export default MyData;