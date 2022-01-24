
import './App.css';
import Greetings, {Hello} from './components/Greetings';
import Button,{Input, Simple} from './components/Button';
import {Counter} from './components/Counter';
import {MyData} from './components/MyData';
function User (props){
  let profile = props.profile;
  return(<div>
    <h3>name :{profile.name} age : {profile.age} date of birth : {profile.dob.toLocaleDateString()}  </h3>
  </div>)
}
function Welcome(props){
  return(<div><h3> {props.message}</h3></div>)

}
function App() {
   let message ="hello everyone";
   let profile = { name: "alex", age: 34,dob: new Date(1998,10,13) };
  
  return (<div>
    <h1>welcome to react
    </h1>
    <Welcome message={message}/>
    <User profile = {profile}/> 
    <Hello name ={ profile.name}/>
    <Greetings firstName = 'Shravani' lastName ='Chandaka' />
    <Button/> 
    <Simple/>
    <Input/>
    <Counter/>
    <MyData/>
    </div>)
  
}

export default App;
