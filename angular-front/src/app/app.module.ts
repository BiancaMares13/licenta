import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {AgmCoreModule} from '@agm/core';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {HorizontalSliderModule} from "angular2-horizontal-slider";
import { HomepageComponent } from './homepage/homepage.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AppRoutingModule} from "./app-routing.module";
import {MainService} from "./main.service";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HorizontalSliderModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBYaJuMcDjgcbqQfuVKjbbTdc_gWPyjiaI'
    })
  ],
  providers: [MainService],
  bootstrap: [AppComponent]
})
export class AppModule { }
