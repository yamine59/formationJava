function calculator(number1,number2, callback ){
    return callback(number1, number2);
}

function addition(number1, number2) {
    return number1 + number2;
}

console.log(calculator(5, 3, addition));

console.log(calculator(10, 20, (num1, num2) => num1 - num2));

const division = (num1, num2) => num1 / num2;
console.log(calculator(10, 2, division));

const logName = name => console.log(`Hello, ${name}!`);
logName("Alice");

