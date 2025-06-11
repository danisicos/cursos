function outer() {
    var count = 0;
    return function inner() {
        count++;
        console.log(count);
    }
}

const counter1 = outer();
counter1(); // 1
counter1(); // 2  

const counter2 = outer();
counter2(); // 1
counter1(); // 3

console.log(count)