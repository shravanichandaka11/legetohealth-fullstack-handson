import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-tdf-demo',
  templateUrl: './tdf-demo.component.html',
  styleUrls: ['./tdf-demo.component.css']
})
export class TdfDemoComponent {
  constructor (private _service: EmployeeService){}
 handleClick():void{
  console.log(this._service.store());
 }
  handleSubmit(formData:any){
      
    console.log(formData);


  }

}
