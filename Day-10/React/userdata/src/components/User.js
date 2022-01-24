import React,{Component} from'react';
export class User extends React.Component{
    constructor(props){
        super(props);
        this.state= {name :'', age:'', gender:''}
    }
    render(){
        return(<div>
           <h1><p> Enter the details </p></h1> 
           <label>Name
           <input type='text' onChange = {event=>this.setState({name:event.target.value})}></input>
           </label>
           <label>Age
           <input type='text' onChange = {event=>this.setState({age:event.target.value})}></input>
           </label>
           <label>Male
           <input type='radio' value='Male' onSelectedOption = {event=>this.setState({gender:event.target.value})}></input>
           </label>
           <label>Female
           <input type='radio' value='Female' onSelectedOption= {event=>this.setState({gender:event.target.value})}></input>
           </label>
          <div>Name:{this.state.name}
          Age: {this.state.age}
          Gender: {this.state.gender}
          </div>

        </div>)
    }
}

