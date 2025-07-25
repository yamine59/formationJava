export class Library {
    constructor() {
        this.books = []; // Initialize the books array
    }
    addBook(book) {
        this.books.push(book);
    }
    removeBook(title) {
        this.books = this.books.filter(b => b.title !== title);
    }
    findBookByTitle(title) {
        return this.books.find(b => b.title === title);
    }
    listAvailableBooks() {
        return this.books.filter(b => b.isAvailable);
    }
    getBooksByAuthor(authorName) {
        return this.books.filter(b => b.author.name === authorName);
    }
}
