import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent  {
  employees: any  = [{ id: 101, name:"Alex", sal: 24000},
{id:102,name: "Arjun",sal: 25000},
{id:103,name:"Ayaan", sal: 34000}];
  
}
