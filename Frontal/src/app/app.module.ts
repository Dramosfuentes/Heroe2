import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeroeComponent } from './heroe/heroe.component';
import { TableModule } from 'primeng/table';
import {HttpClientModule} from '@angular/common/http';
import { HeroService } from './services/hero.service';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { RouteConfigLoadEnd, Router, RouterModule, Routes } from '@angular/router';
import { FormComponent } from './heroe/form.component';
import { FormsModule } from '@angular/forms';

const routes: Routes =[
  {path:'', redirectTo: '/heroes', pathMatch: 'full'},
  {path:'heroe', component: HeroeComponent },
  {path:'heroe/form', component: FormComponent },
  {path:'heroe/form/:id', component: FormComponent },
]

@NgModule({
  declarations: [
    AppComponent,
    HeroeComponent,
    HeaderComponent,
    FooterComponent,
    FormComponent
  ],
  imports: [
    BrowserModule,TableModule, HttpClientModule, FormsModule, RouterModule.forRoot(routes)
  ],
  providers: [HeroService],
  bootstrap: [AppComponent]
})
export class AppModule { }
