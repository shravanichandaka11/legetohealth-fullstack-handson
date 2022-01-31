import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'forms-demo';
  //suppling the employee service
  constructor(private _service:EmployeeService){}
  test():void{
    
    }
    handleClick():void{
      this._service.store();
      
  }
}
