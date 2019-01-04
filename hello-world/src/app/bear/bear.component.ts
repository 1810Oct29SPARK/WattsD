import { Component, OnInit } from '@angular/core';
import { Bear } from '../models/bear.model';
import { BearService } from '../services/bear.sevice';

@Component({
  selector: 'app-bear',
  templateUrl: './bear.component.html',
  styleUrls: ['./bear.component.css']
})
export class BearComponent implements OnInit {

  private bears: Bear[];

  constructor(private bearservice: BearService) { }

  public objectStyle = {
    color: 'red',
    border: '1px solid black',
    cursor: 'pointer',
    margin: '2px'
  };

  ngOnInit() {
    this.bears = this.bearservice.getBears();
    console.log(this.bears);
  }

}
