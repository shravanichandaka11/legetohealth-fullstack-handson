import React,{Component} from 'react';
export class Counter extends React.Component{
    constructor(props){
        super(props);
        this.state= {likes:0 ,dislikes:0}
    }
    likesCounter =(event)=>{
        this.setState(prevState=>({likes:  prevState.likes + 1 }));
    }
    dislikesCounter =(event)=>{
        this.setState(prevState=>({dislikes:  prevState.dislikes + 1 }));
    }
    render(){
        return(
            <div> 
                <h2>counter component</h2>
                <p> Likes {this.state.likes}: </p>
                <p> Dislikes: {this.state.dislikes}</p>
                <button onClick={this.likesCounter}>Likes</button>
                <button onClick={this.dislikesCounter}>Dislikes</button>
            </div>
        )

    }
}
export default Counter;