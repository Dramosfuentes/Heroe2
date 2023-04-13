import { Component, OnInit } from '@angular/core';
import { TableModule } from 'primeng/table';
import { Heroe } from '../model/heroe';
import { HeroService } from '../services/hero.service';

@Component({
  selector: 'app-heroe',
  templateUrl: './heroe.component.html',
  styleUrls: ['./heroe.component.css']
})
export class HeroeComponent implements OnInit {
  

  hero!: Heroe[];

  constructor(private heroService: HeroService){}

  ngOnInit() {
    this.heroService.getHeroe().subscribe(
      hero => this.hero = hero
    )
  }
  delete(hero: Heroe): void {
  this.heroService.delete(hero.id).subscribe(
    response => {
      this.hero = this.hero.filter(cli => cli !== hero)
    })}
}
