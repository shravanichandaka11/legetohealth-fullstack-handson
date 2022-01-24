import React, {Component} from 'react';
//import { render } from 'react-dom';
export class Hello extends React.Component{
    constructor(props){
        super(props);
    }
        render() {
            return(<div>
              <p>Hello {this.props.name}</p>
            </div>)
        }
    
}
class Greetings extends React.Component{
    constructor(props){
        super(props);
    }
        render(){
            return(<div>
                <p>Hello {this.props.firstName} {this.props.lastName}</p>
            </div>)

        }
    
}
export default Greetings;