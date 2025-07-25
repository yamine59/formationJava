export interface Author {
    name: string,
    birthYear: number,
    genre: Genres
}

export enum Genres {
    Masculine,
    Feminine
}

export interface Book {
    title:string,
    author:Author,
    pages:number,
    isAvailable:boolean
}