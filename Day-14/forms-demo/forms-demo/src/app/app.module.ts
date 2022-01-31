import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { FormsModule } from '@angular/forms';
import { MdfDemoComponent } from './mdf-demo/mdf-demo.component';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { FetchEmployeeComponent } from './fetch-employee/fetch-employee.component';
import { FetchEmployeeByIdComponent } from './fetch-employee-by-id/fetch-employee-by-id.component';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProfileComponent } from './profile/profile.component';
import { SettingsComponent } from './settings/settings.component';
import {EmpGuard} from './emp.guard';


let routeConfig: Routes=[
  {path: '', component:FetchEmployeeComponent},
  {path:'LoadAll', component: FetchEmployeeComponent},
  {path:'LoadByID', component: FetchEmployeeByIdComponent},
  {path:'tdf',component:TdfDemoComponent},
  {path:'mdf',component: MdfDemoComponent},
  {path:'success/:un',component:SuccessComponent, canActivate: [EmpGuard],
  children: [{path:'',component: DashboardComponent},
  {path:'dashboard', component:DashboardComponent},
  {path: 'settings',component:SettingsComponent},
  {path:'profile', component:ProfileComponent}]}
  
]


@NgModule({
  declarations: [
    AppComponent,
    TdfDemoComponent,
    MdfDemoComponent,
    FetchEmployeeComponent,
    FetchEmployeeByIdComponent,
    SuccessComponent,
    DashboardComponent,
    ProfileComponent,
    SettingsComponent
  ],
  imports: [
    BrowserModule, FormsModule,ReactiveFormsModule, HttpClientModule,
    RouterModule.forRoot(routeConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
