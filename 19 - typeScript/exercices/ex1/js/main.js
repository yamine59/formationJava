import { Genres } from "./interface.js";
import { Library } from "./Library.js";
function createBook(title, author, pages) {
    let book = {
        title: title,
        author: author,
        pages: pages,
        isAvailable: true
    };
    return book;
}
function toggleAvailability(book) {
    book.isAvailable = !book.isAvailable;
}
let library = new Library;
let author1 = {
    name: "yamine",
    birthYear: 2002,
    genre: Genres.Masculine
};
let author2 = {
    name: "sali",
    birthYear: 1957,
    genre: Genres.Masculine
};
let book = createBook("test", author1, 1500);
let book2 = createBook("soleil", author1, 1440);
let book3 = createBook("mohamed", author2, 245);
let book4 = createBook("pain", author2, 9);
toggleAvailability(book2);
library.addBook(book);
library.addBook(book2);
library.addBook(book3);
library.addBook(book4);
console.table(library.books);
console.table(library.findBookByTitle("soleil"));
console.table(library.getBooksByAuthor("yamine"));
console.table(library.listAvailableBooks());
library.removeBook("pain");
console.table(library.books);
