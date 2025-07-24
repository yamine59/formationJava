import { Animal } from "./Animal.js";

export class Lion extends Animal {

    constructor(nom,age){
        super(nom,age)
    }

    crier(){
        return `Ce lion cri ${this.cri}` ;
    }

    chasser(){
        return "le lion chasse"
    }
}