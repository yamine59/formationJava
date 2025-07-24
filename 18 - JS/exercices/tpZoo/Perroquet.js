import { Animal } from "./Animal.js";

export class Perroquet extends Animal {

    constructor(nom,age){
        super(nom,age)
    }

    crier(){
        return  `Ce Perroquet cri ${this.cri}` ;
    }

    chasser(){
        return "le Perroquet chasse"
    }
}