class User {
    readonly id: number;
    private name: string;
    protected email?: string;

    constructor(id: number, name: string, email?: string) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    getDetail(): string {
        return `${this.id} - ${this.name} - ${this.email}`;
    }
}

let user = new User(1, "John", "j@j.com");
console.log(user.getDetail());