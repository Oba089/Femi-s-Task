1.

num = int(input("Enter a non-negative integer: "))

factorial = 1

if num < 0:

    print("Factorial is not defined for negative numbers.")

else:

    print(f"Calculating {num}! ...")

    for i in range(1, num + 1):

        factorial *= i

        print(f"Step {i}: {factorial}")
    
    print(f"\nThe factorial of {num} is {factorial}")

2

a = int(input("Enter first number: "))

b = int(input("Enter second number: "))

print("\nSimulating GCD calculation using Euclidean algorithm:")

while b != 0:

    print(f"a = {a}, b = {b}")

    a, b = b, a % b

print(f"\nGCD is: {a}")

3
def find_lcm(a, b):

    max_num = max(a, b)

    while True:

        if max_num % a == 0 and max_num % b == 0:

            return max_num

        max_num += 1

a = 12
b = 18
print("LCM of", a, "and", b, "is", find_lcm(a, b))

4.

def is_perfect(number):

    if number < 2:

        return False

    sum_of_divisors = 0

    for i in range(1, number):

        if number % i == 0:

            sum_of_divisors += i

    return sum_of_divisors == number

num = 28

if is_perfect(num):

    print(num, "is a Perfect Number")
else:
    print(num, "is NOT a Perfect Number")

5

def is_armstrong(number):

    digits = str(number)

    power = len(digits)

    total = sum(int(digit) ** power for digit in digits)

    return total == number


num = 153

if is_armstrong(num):
    print(num, "is an Armstrong Number")
else:
    print(num, "is NOT an Armstrong Number")

6
for (let num = 1; num <= 1000; num++) {

    let digits = num.toString().length;
    let sum = num.toString()
                 .split('')
                 .reduce((acc, d) => acc + Math.pow(parseInt(d), digits), 0);

    if (sum === num) {
        process.stdout.write(num + " ");
    }
}

7.

for (let num = 1; num <= 1000; num++) {

    let sum = 0;
    for (let i = 1; i <= num / 2; i++) {

        if (num % i === 0) {
            sum += i;
        }
    }
    if (sum === num) {
        process.stdout.write(num + " ");
    }
}

8.

def is_strong_number(num):

    def factorial(n):
        fact = 1

        for i in range(2, n + 1):
            fact *= i
        return fact

    sum_of_factorials = sum(factorial(int(d)) for d in str(num))

    return sum_of_factorials == num


num = 145 
if is_strong_number(num):
    print(f"{num} is a Strong number.")
else:
    print(f"{num} is NOT a Strong number.")

factorial(n) {
    let fact = 1;
    for (let i = 2; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

9.

for (let year = 1900; year <= 2025; year++) {

    if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
        process.stdout.write(year + " ");
    }
}

10.

def is_leap_year(year):
    return (year % 4 == 0) and (year % 100 != 0 or year % 400 == 0)

count = 0

for year in range(1900, 2026):
    if is_leap_year(year):
        count += 1

print("Number of leap years between 1900 and 2025:", count)
