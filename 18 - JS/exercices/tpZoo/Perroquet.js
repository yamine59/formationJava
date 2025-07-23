import { Animal } from "./Animal.js";

export class Perroquet extends Animal {

    constructor(nom,age,espece,cri){
        super(nom,age)
        this.espece = espece;
        this.cri = cri
    }

    crier(){
        return  `Ce Perroquet cri ${this.cri}` ;
    }

    chasser(){
        return "le Perroquet chasse"
    }
}