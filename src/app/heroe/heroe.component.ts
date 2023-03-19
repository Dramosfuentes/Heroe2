import { Component, OnInit } from '@angular/core';
import { TableModule } from 'primeng/table';
import { Heroe } from '../model/heroe';

@Component({
  selector: 'app-heroe',
  templateUrl: './heroe.component.html',
  styleUrls: ['./heroe.component.css']
})
export class HeroeComponent implements OnInit {

  hero = Heroe;

  ngOnInit() {
  }

}
