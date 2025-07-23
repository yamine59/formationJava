import { Animal } from "./Animal.js";

export class Lion extends Animal {

    constructor(nom,age,espece,cri){
        super(nom,age)
        this.espece = espece;
        this.cri = cri
    }

    crier(){
        return `Ce lion cri ${this.cri}` ;
    }

    chasser(){
        return "le lion chasse"
    }
}