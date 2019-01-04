import { Beartype } from './bear-type.model';
import { Cave } from './cave.model';
export class Bear {
  id: number;
  name: string;
  cave: Cave;
  type: Beartype;
  weight: number;
  constructor(id: number, name: string, cave: Cave, type: Beartype, weight: number) {
    this.id = id;
    this.name = name;
    this.cave = cave;
    this.type = type;
    this.weight = weight;
  }
}
