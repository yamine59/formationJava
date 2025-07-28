import { User } from "./interface.js";
let id = 0;
export function createUser(firstname:string,lastname:string,birthdate:Date,email?:string,phone?:string,avatar?:string) : User {
    return {
        id:++id,
        firstname:firstname,
        lastname:lastname,
        birthdate:birthdate,
        email:email,
        phone:phone,
        avatar:avatar
    }
}
