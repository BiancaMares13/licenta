import {Component, Inject, OnInit} from '@angular/core';
import {Args} from "../domain/args";
import {MainService} from "../main.service";
import {Product} from "../domain/product";
import {DOCUMENT} from "@angular/common";

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {
  public searchArguments: Args;
  latitude = 46.7712;
  longitude = 23.6236;
  public searchResult: Product[];

  constructor(private mainService: MainService, @Inject(DOCUMENT) private document: any) {
    this.searchArguments = new Args();
  }

  ngOnInit() {
  }


  onChoseLocation(event) {
    this.latitude = event.coords.lat;
    this.longitude = event.coords.lng;
  }

  doSearch() {
    this.mainService.doSearch(this.searchArguments).subscribe(resp=>{
      this.searchResult=resp;
    })
  }

  recenter() {
    this.latitude = 46.7712;
    this.longitude = 23.6236;
  }
}
