2.

for (let number = 51; number < 100; number += 2) {
    console.log(number);
}

3.

for (let number = 100; number >= 1; number--) {
    console.log(i);
}


5.

for (let number = 1; number <= 50; number++) {
    if (number % 3 === 0) {
        console.log(number);
    }
}

6.

for (let number = 1; number <= 100; number++) {
    if (number % 3 === 0 && number % 5 === 0) {
        console.log(number);
    }
}

7.

let count = 0;
for (let count = 1; count <= 100; count++) {
    if (count % 7 === 0) {
        count++;
    }
}
console.log("Count of numbers divisible by 7 between 1 and 100: " + count);

8.

let sum = 0;
for (let number = 1; number <= 50; number++) {
    sum += number;
}
console.log("Sum of the first 50 natural numbers: " + sum);

9.

let product = 1;
for (let number = 1; number <= 10; number++) {
    product *= number;
}
console.log("Product of the first 10 natural numbers: " + product);


11.

const number = 7; 
for (let number = 1; number <= 10; number++) {
    console.log(${numbers} x ${number} = ${numbers * number});
}

12.

const str = "Good, Morning!";
for (let a = 0; a < str.length; a++) {
    console.log(str[a]);
}

16.

let input = "Beautiful Day!";
let vowels = "aeiouAEIOU";
let count = 0;

for (let a = 0; a < input.length; a++) {
    let c = input[a];
    if (vowels.includes(c)) {
        count++;
    }
}

console.log("Original:", input);
console.log("Number of vowels:", count);

