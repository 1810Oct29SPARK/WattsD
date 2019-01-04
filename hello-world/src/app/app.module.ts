import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { BearComponent } from './bear/bear.component';
import { BearService } from './services/bear.sevice';
import { DogComponent } from './dog/dog.component';
import {HttpClientModule} from '@angular/http';

@NgModule({
  declarations: [
    BearComponent,
    DogComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [BearService],
  bootstrap: [BearComponent]
})
export class AppModule { }
