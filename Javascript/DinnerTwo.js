1.

let num = parseInt(prompt("Enter a non-negative integer:"));

if (isNaN(num) || num < 0) {

    console.log("Factorial is not defined for negative numbers.");

} else {

    let factorial = 1;
    console.log(Calculating ${num}! ...);

    for (let i = 1; i <= num; i++) {
        factorial *= i;
        console.log(Step ${i}: ${factorial});
    }

    console.log(\nThe factorial of ${num} is ${factorial});
}

2.

let a = parseInt(prompt("Enter first number:"));

let b = parseInt(prompt("Enter second number:"));

console.log("\nSimulating GCD calculation using Euclidean algorithm:");

while (b !== 0) {

    console.log(a = ${a}, b = ${b});

    let temp = b;
    b = a % b;
    a = temp;
}

console.log(\nGCD is: ${a});

3.

num1 = 12
num2 = 18

lcm = max(num1, num2)

while True:
    if lcm % num1 == 0 and lcm % num2 == 0:
        print("LCM is:", lcm)
        break
    lcm += 1

let num1 = 12;
let num2 = 18;

let lcm = Math.max(num1, num2);

while (true) {
    if (lcm % num1 === 0 && lcm % num2 === 0) {
        console.log("LCM is:", lcm);
        break;
    }
    lcm++;
}

4.

isPerfect(number) {
    if (number < 2) return false;

    let sum = 0;
    for (let i = 1; i < number; i++) {
        if (number % i === 0) {
            sum += i;
        }
    }
    return sum === number;
}

let num = 28;

if (isPerfect(num)) {

    console.log(${num} is a Perfect Number);

} else {

    console.log(${num} is NOT a Perfect Number);
}

5.

isArmstrong(number) {

    let digits = number.toString().split('');

    let power = digits.length;

    let sum = digits.reduce((acc, digit) => acc + Math.pow(parseInt(digit), power), 0);

    return sum === number;
}


let num = 153;

if (isArmstrong(num)) {

    console.log(${num} is an Armstrong Number);

} else {

    console.log(${num} is NOT an Armstrong Number);
}

6.

print("Armstrong numbers between 1 and 1000:")

for num in range(1, 1001):

    digits = len(str(num))

    sum_of_powers = sum(int(d)**digits for d in str(num))

    if num == sum_of_powers:

        print(num, end=" ")

console.log("Armstrong numbers between 1 and 1000:");

7.

print("Perfect numbers between 1 and 1000:")

for num in range(1, 1001):

    sum_of_divisors = sum(i for i in range(1, num // 2 + 1) if num % i == 0)

    if sum_of_divisors == num:

        print(num, end=" ")

console.log("Perfect numbers between 1 and 1000:");

8.

function isStrongNumber(num) {

    let digits = num.toString().split('');

    let sum = digits.reduce((acc, d) => acc + factorial(parseInt(d)), 0);

    return sum === num;
}

let num = 145;

if (isStrongNumber(num)) {

    console.log(${num} is a Strong number.);

} else {

    console.log(${num} is NOT a Strong number.);
}

9.

print("Leap years between 1900 and 2025:")

for year in range(1900, 2026):

    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):

        print(year, end=" ")

console.log("Leap years between 1900 and 2025:");

10

function isLeapYear(year) {

    return (year % 4 === 0) && (year % 100 !== 0 || year % 400 === 0);
}

let count = 0;

for (let year = 1900; year <= 2025; year++) {

    if (isLeapYear(year)) {

        count++;
    }
}

console.log("Number of leap years between 1900 and 2025:", count);
