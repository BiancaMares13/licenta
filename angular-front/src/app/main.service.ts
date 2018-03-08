import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Args} from "./domain/args";
import {Observable} from "rxjs/Observable";
import {Product} from "./domain/product";

@Injectable()
export class MainService {
  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };
  constructor(private http: HttpClient) {
  }

  doSearch(args: Args):Observable<Product[]>{
    const body=JSON.stringify(args);
    return this.http.post<Product[]>("http://localhost:8080/doSearch",body, this.httpOptions);
  }

}
