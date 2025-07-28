export class Library {
    constructor() {
        this.users = [];
    }
    addUsers(user) {
        this.users.push(user);
    }
    removeUsers(user) {
        this.users = this.users.filter(u => u !== user);
    }
}
