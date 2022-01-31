import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-fetch-employee-by-id',
  templateUrl: './fetch-employee-by-id.component.html',
  styleUrls: ['./fetch-employee-by-id.component.css']
})
export class FetchEmployeeByIdComponent implements OnInit {

  constructor(private _service: EmployeeService,
    private _builder: FormBuilder) { }
    employee = this._builder.group({
      id:[],name:[],age:[]
    })
    ngOnInit(): void {
        
    }
  emp :any = undefined;
  errormessage: any = undefined;
  handleClick():void{
    let id = this.employee.controls['id'].value;
   
    this._service.fetchEmployeeByID(id).subscribe(response =>{
          this.emp=response;
      this.errormessage= undefined;
      }, (err: { console: { error: any; }; }) =>{
        this.errormessage= err.console.error;
        this.emp= undefined;
        
      });

  }
}
