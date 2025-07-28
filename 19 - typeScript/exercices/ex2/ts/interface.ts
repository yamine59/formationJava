export interface User {
    id: number;
    firstname: string;
    lastname: string;
    birthdate: Date;
    email?: string;
    phone: string;
    avatar: string;
}