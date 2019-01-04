import { Component, OnInit } from '@angular/core';
import {DogserviceService} from '../dogservice.service';

@Component({
  selector: 'app-dog',
  templateUrl: './dog.component.html',
  styleUrls: ['./dog.component.css']
})
export class DogComponent implements OnInit {
imgUrl:string;
  constructor() { }

  ngOnInit() {
  }
  getDog()
  {
    this.dogService.getRandomDog().subscribe( (e) =>{
      this.imgUrl = e;
    })
  }

}
