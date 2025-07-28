export class Contacts {
    constructor() {
        this.contacts = [];
    }
    addUsers(user) {
        this.contacts.push(user);
    }
    removeUsers(user) {
        this.contacts = this.contacts.filter(u => u !== user);
    }
    getNameContacts() {
        return this.contacts.map(u => u.firstname + " " + u.lastname);
    }
}
