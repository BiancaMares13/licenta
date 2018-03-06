import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  latitude=46.7712;
  longitude=23.6236;

  onChoseLocation(event){
this.latitude=event.coords.lat;
this.longitude=event.coords.lng;
  }

  recenter(){
    this.latitude=46.7712;
    this.longitude=23.6236;
  }
}

