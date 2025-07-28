import { Contacts } from "./Contacts.js";
import { createUser } from "./fonction.js";
import { User } from "./interface.js";

let firstname = document.querySelector('#firsname') as HTMLInputElement;
let lastname = document.querySelector('#lastname') as HTMLInputElement;
let birthdate = document.querySelector('#birthdate') as HTMLInputElement;
let email = document.querySelector('#email') as HTMLInputElement;
let phone = document.querySelector('#phone') as HTMLInputElement;
let avatar = document.querySelector('#avatar') as HTMLInputElement;
let contacts = new Contacts

let user : User = {
    id: 0,
    firstname: "test",
    lastname: "aaa",
    birthdate: new Date(),
    email: "",
    phone: "",
    avatar: ""
}   
let user2 : User = {
    id: 0,
    firstname: "tesddddddddt",
    lastname: "aaaddddd",
    birthdate: new Date(),
    email: "",
    phone: "",
    avatar: ""
} 
contacts.addUsers(user);
contacts.addUsers(user2);


document.querySelector('#submitUser').addEventListener('click', (e) => {
    e.preventDefault();
    let user = createUser(firstname.value,lastname.value,new Date(birthdate.value),email.value,phone.value,avatar.value);
    console.log(user);
    contacts.addUsers(user);

    let listContacts = document.querySelector('#listContacts') as HTMLDivElement;

    let div = document.createElement('button');
        div.className = `btn btn-primary w-100 m-4 h-40 user${user.id}`;
        div.textContent = user.firstname + " " + user.lastname;
        console.log(div+"test");
        
        listContacts.appendChild(div);
})

window.addEventListener('DOMContentLoaded', () => {

    let listContacts = document.querySelector('#listContacts') as HTMLDivElement;
  console.log("testttttt");
  
    contacts.contacts.forEach(user => {
        let div = document.createElement('button');
        div.className = `btn btn-primary user${user.id}`;
        div.textContent = user.firstname + " " + user.lastname;
        
        listContacts.appendChild(div);
    });
})