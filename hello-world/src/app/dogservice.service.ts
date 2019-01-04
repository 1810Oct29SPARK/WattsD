import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/http';

@Injectable({
  providedIn: 'root'
})
export class DogserviceService {

  constructor() { }
  getRandomDog(): Observable<any>{
    return this.http.get('http://dog.ceo/api/breeds/images/random.com');
  }
}
