import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-app';
  users =[
    {name: 'Alex',gende: 'Male'},
    {name: 'jenny', gende:'Female'},
    {name:'Charles', gende:'Female'}
  ]
}
