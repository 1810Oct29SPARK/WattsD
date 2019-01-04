import { Bear } from '../models/bear.model';
import { Injectable } from '@angular/core';
import { Beartype } from '../models/bear-type.model';
import { Cave } from '../models/cave.model';

@Injectable
export class BearService {
  public getBears(): Bear[] {
    let bears: Array<Bear>;
    let cave: new Cave(1, "Big");
    let beartype: new Beartype(1, "Panda");
    bears.push(new Bear(3, "Kota", cave, beartype, 300));
    return bears;
  }
}
