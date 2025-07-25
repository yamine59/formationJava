
interface User {
    readonly id:number,
    name: string,
    email?: string,
    isActivate: boolean
}
// METTRE UN ATTRIBUT OPTIONNEL DANS L'INTERFACE AVEC '?'
// METTRE UN ATTRIBUT READONLY DANS L'INTERFACE AVEC 'readonly'
let user1 : User = {
    id: 1,
    name: "John",
    email: "j@j.com",
    isActivate: true
}

type UserOrNull = User | null;
let user2 : UserOrNull = null

type status = "active" | "inactive" | "suspendu";
let userStatus : status = "active";

type Admin = {
    adminLevel: number,
    mdp: string
}

type UserAdmin = User & Admin;
let userAdmin : UserAdmin = {
    id: 1,
    name: "John",
    email: "j@j.com",
    isActivate: true,
    adminLevel: 1,
    mdp: "1234"
}
