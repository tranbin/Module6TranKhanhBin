import { Injectable } from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class MedicalPatientService {

  constructor(private httpClient:HttpClient) { }
}
