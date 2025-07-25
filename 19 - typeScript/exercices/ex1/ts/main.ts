import { createBook, toggleAvailability } from "./fonction.js";
import { Author, Book, Genres } from "./interface.js";
import { Library } from "./Library.js";


let library = new Library;
let author1 :Author = {
   name:"yamine",
   birthYear:2002,
   genre: Genres.Masculine
}
let author2 :Author = {
    name:"sali",
    birthYear:1957,
    genre: Genres.Masculine
 }
 

let book = createBook("test",author1,1500)
let book2 = createBook("soleil",author1,1440)
let book3 = createBook("mohamed",author2,245)
let book4 = createBook("pain",author2,9)
toggleAvailability(book2)
library.addBook(book)
library.addBook(book2)
library.addBook(book3)
library.addBook(book4)
console.log("tous les livres")
console.table(library.books)

console.log("livre avec le titre soleil")
console.log(library.findBookByTitle("soleil"))

console.log("livres de l'autheur yamine")
console.table(library.getBooksByAuthor("yamine"))

console.log("livres disponibles")
console.table(library.listAvailableBooks());

console.log(library.removeBook("pain"))
console.log("livres apres suppression")
console.table(library.books)
