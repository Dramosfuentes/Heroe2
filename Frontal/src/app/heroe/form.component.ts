import { Component, OnInit } from '@angular/core';
import { Heroe } from '../model/heroe';
import { Router,ActivatedRoute } from '@angular/router';
import { HeroService } from '../services/hero.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  heroe: Heroe = new Heroe;
  titulo:string = "crear cliente"
  

    hero!: Heroe[];
  
    constructor(private heroeService: HeroService,
      private route: Router,private activateRoute: ActivatedRoute){}
    ngOnInit() {this.cargarCliente}
    
 cargarCliente():void{
  this.activateRoute.params.subscribe(params =>{
    let id = params['id']
    if(id){
      this.heroeService.getHeroebyId(id).subscribe((heroe)=> this.heroe = heroe)
    }
  })
 }
 create():void{
    this.heroeService.create(this.heroe).subscribe(
      response =>this.route.navigate(['/heroe']) )
    
  }
  update():void{
    this.heroeService.update(this.heroe)
    .subscribe( cliente => {
      this.route.navigate(['/heroe'])
    })
  }

}
