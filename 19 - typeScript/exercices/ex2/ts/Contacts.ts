import { User } from "./interface";

export class Contacts {
    contacts :User[] = [];
    
    addUsers(user:User) : void{
        this.contacts.push(user)
    }
    removeUsers(user:User) : void{
        this.contacts = this.contacts.filter(u => u !== user)
    }

    getNameContacts() : string[]{
        return this.contacts.map(u => u.firstname + " " + u.lastname)
    }
    
}