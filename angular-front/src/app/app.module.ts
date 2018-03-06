import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {AgmCoreModule} from '@agm/core';

import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {HorizontalSliderModule} from "angular2-horizontal-slider";


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HorizontalSliderModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyA8Eaa-vdYNPoy6aTh5fkH3KRqAtx0JhX0'
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
