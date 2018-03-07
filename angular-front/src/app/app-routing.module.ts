import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {HomepageComponent} from "./homepage/homepage.component";
import {AgmCoreModule} from "@agm/core";

const routes: Routes= [
  {path:'', component: HomepageComponent}

];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes),
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBYaJuMcDjgcbqQfuVKjbbTdc_gWPyjiaI'
    })
  ],
  declarations: [],
  exports: [RouterModule,AgmCoreModule]
})

export class AppRoutingModule {}
