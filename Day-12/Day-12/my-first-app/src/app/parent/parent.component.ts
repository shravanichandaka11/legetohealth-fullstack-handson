import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent  {

  firstName ='ALex';
  users =['sachin','kohli','Rohit'];
  clicks: any=0;
  numberOfClicks(value: any){
    console.log(value);
    this.clicks=this.clicks +value;
    
    
  }

}
