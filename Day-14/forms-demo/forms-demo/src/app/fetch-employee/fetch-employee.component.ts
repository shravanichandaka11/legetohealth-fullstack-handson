import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-fetch-employee',
  templateUrl: './fetch-employee.component.html',
  styleUrls: ['./fetch-employee.component.css']
})
export class FetchEmployeeComponent implements OnInit{

  constructor(private _service1: EmployeeService) { }
   
    employees:any = undefined;
    ngOnInit(): void {
      this._service1.fetchEmployee().subscribe(response =>{
        this.employees=response;
        console.log(this.employees); 
    });
  }
}
