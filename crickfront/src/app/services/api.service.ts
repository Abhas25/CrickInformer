import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private httpClient:HttpClient) {

   }

   getLiveScore(){
    return this.httpClient.get(`http://localhost:8090/match/live`)
   }

   getAllMatches(){
    return this.httpClient.get(`http://localhost:8090/match`)
   }
   getCWC2023PointTable(){
    return this.httpClient.get(`http://localhost:8090/match/point-table`)
   }
}
