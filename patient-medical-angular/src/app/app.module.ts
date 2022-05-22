import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PatientMedicalListComponent } from './medical/patient-medical-list/patient-medical-list.component';
import { PatientListComponent } from './patient/patient-list/patient-list.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    PatientMedicalListComponent,
    PatientListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
