import { NgModule, Component} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from '../register/register.component';
import { ResultComponent } from '../result/result.component';

const routes: Routes = [
{ path: '', component: RegisterComponent },
{ path:'result',component:ResultComponent},
];

@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ]
})

export class RoutingComponent  {


}
