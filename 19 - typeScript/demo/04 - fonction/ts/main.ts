function add(a: number, b: number): number {
    return a + b;
}

let result : number = add(1,2);

function add2(a: number, b: number = 15): number {
    return a + b;
}

let result2 : number = add2(1,2);

let mafonction = (a: number, b: number): number => {
    return a + b;
}

function test<T>(arg: T): T {
    return arg;
}

test<string>("Hello");
test<number>(1);