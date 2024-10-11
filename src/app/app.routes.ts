import { Routes } from '@angular/router';
import { CustomerListComponent } from './customer-list/customer-list.component';

export const routes: Routes = [
  { path: '', redirectTo: '/customerlist', pathMatch: 'full' }, // Standaard route
  { path: 'customerlist', component: CustomerListComponent },    // De route naar je klantenlijst
];

