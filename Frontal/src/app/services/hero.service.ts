import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Heroe } from '../model/heroe';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  private urlEndPoint: string =' http;//localhost:8080/api/heroes'
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'})


  constructor(private http: HttpClient) { }

  getHeroe(): Observable<Heroe[]>{
    return this.http.get(this.urlEndPoint).pipe(
      map(response => response as Heroe[])
      );
    
  }
  create(heroe: Heroe) : Observable<Heroe> {
    return this.http.post<Heroe>(this.urlEndPoint, heroe, {headers: this.httpHeaders} )
  }
  getHeroebyId(id: number):Observable<Heroe>{
    return this.http.get<Heroe>(`${this.urlEndPoint}/${id}`)
  
      
  }

  update(heroe: Heroe): Observable<Heroe>{
    return this.http.put<Heroe>(`${this.urlEndPoint}/${heroe.id}`, heroe, {headers: this.httpHeaders})
  }

  delete(id: number): Observable<Heroe>{
    return this.http.delete<Heroe>(`${this.urlEndPoint}/${id}`, {headers: this.httpHeaders})
  }
}
