import { Contacts } from "./Contacts.js";
import { createUser } from "./fonction.js";
let firstname = document.querySelector('#firsname');
let lastname = document.querySelector('#lastname');
let birthdate = document.querySelector('#birthdate');
let email = document.querySelector('#email');
let phone = document.querySelector('#phone');
let avatar = document.querySelector('#avatar');
let contacts = new Contacts;
let user = {
    id: 0,
    firstname: "test",
    lastname: "aaa",
    birthdate: new Date(),
    email: "",
    phone: "",
    avatar: ""
};
let user2 = {
    id: 0,
    firstname: "tesddddddddt",
    lastname: "aaaddddd",
    birthdate: new Date(),
    email: "",
    phone: "",
    avatar: ""
};
contacts.addUsers(user);
contacts.addUsers(user2);
document.querySelector('#submitUser').addEventListener('click', (e) => {
    e.preventDefault();
    let user = createUser(firstname.value, lastname.value, new Date(birthdate.value), email.value, phone.value, avatar.value);
    console.log(user);
    contacts.addUsers(user);
    let listContacts = document.querySelector('#listContacts');
    let div = document.createElement('button');
    div.className = `btn btn-primary w-100 m-4 h-40 user${user.id}`;
    div.textContent = user.firstname + " " + user.lastname;
    console.log(div + "test");
    listContacts.appendChild(div);
});
window.addEventListener('DOMContentLoaded', () => {
    let listContacts = document.querySelector('#listContacts');
    console.log("testttttt");
    contacts.contacts.forEach(user => {
        let div = document.createElement('button');
        div.className = `btn btn-primary user${user.id}`;
        div.textContent = user.firstname + " " + user.lastname;
        listContacts.appendChild(div);
    });
});
