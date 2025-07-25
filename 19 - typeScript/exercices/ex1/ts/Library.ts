import { Book } from "./interface.js";

export class Library {
    books:Book[]

    constructor() {
        this.books  = []; // Initialize the books array
    }
    
    addBook(book: Book){

        this.books.push(book)
    }
    removeBook(title: string) :void{
        this.books = this.books.filter(b => b.title !== title)
    }
    findBookByTitle(title: string) : Book | undefined{
        return this.books.find(b => b.title === title)
    }
    listAvailableBooks() : Book[] {
        return this.books.filter(b => b.isAvailable)
    }
    getBooksByAuthor(authorName: string) : Book[] {
        return this.books.filter(b => b.author.name === authorName)
    }
}