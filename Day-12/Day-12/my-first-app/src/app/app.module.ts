import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
//import { EmployeeComponent } from './employee/employee.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
//import { HelloComponent } from './hello/hello.component';

import { DataBindComponent } from './data-bind/data-bind.component';
import{ FormsModule } from '@angular/forms';
import { GenderPipe } from './gender.pipe';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
@NgModule({
  declarations: [
    AppComponent,
    
    DataBindComponent,
         GenderPipe,
         ParentComponent,
         ChildComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
