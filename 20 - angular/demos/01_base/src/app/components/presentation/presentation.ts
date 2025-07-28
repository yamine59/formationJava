import { Component } from '@angular/core';

@Component({
  selector: 'app-presentation',
  imports: [],
  templateUrl: './presentation.html',
  styleUrl: './presentation.css'
})
export class Presentation {
  name : string = 'toto';
  isLogged : boolean = true;
  m2i : string = "https://campusnumerique.auvergnerhonealpes.fr/app/uploads/2021/10/logo_m2iformation.jpg";

  toggleLogged() : void {
    this.isLogged = !this.isLogged
  }
}
