import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  baseUrl = 'http://localhost:9090';
  constructor(private _client: HttpClient ) { }
  store():void{
    console.log('store in service');
    
  }
  fetchEmployee(): Observable<any> {
    let url = `${this.baseUrl}/employee`;
    return this._client.get(url);
  }
  fetchEmployeeByID(empId:Number):Observable<any>{
    let url = `${this.baseUrl}/employee/${empId}`;
    return this._client.get(url);
  }

}
