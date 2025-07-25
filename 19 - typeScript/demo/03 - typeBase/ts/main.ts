let age : number = 23;

let firstname : string = "John";

let isStudent : boolean = true;

let value : any = "Hello";
value = 23;

let a : undefined = undefined;
let b : null = null;

let list : number[] = [1, 2, 3];
let list2 : Array<number> = [1, 2, 3];

let person : [string, number] ;
person = ["John", 23];

enum Color {
    Red,
    Green,
    Blue
}

let color : Color = Color.Green;

let varA : unknown = 4
varA = "Hello"
// varA.toUpperCase() => erreur

if (typeof varA === "string") {
    console.log(varA.toUpperCase()) 
}