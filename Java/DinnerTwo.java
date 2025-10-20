1.

import java.util.Scanner;

public class FactorialSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            System.out.println("Calculating " + num + "! ...");

            for (int i = 1; i <= num; i++) {
                factorial *= i;
                System.out.println("Step " + i + ": " + factorial);
            }

            System.out.println("\nThe factorial of " + num + " is " + factorial);
        }

    }
}

2

import java.util.Scanner;

public class GCDLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("\nSimulating GCD calculation using Euclidean algorithm:");

        while (b != 0) {
            System.out.println("a = " + a + ", b = " + b);
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("\nGCD is: " + a);
    }
}

3

public class LCMCalculator {
    public static void main(String[] args) {
        int num1 = 12, num2 = 18, lcm;

        lcm = (num1 > num2) ? num1 : num2;

        while(true) {

            if(lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM is: " + lcm);
                break;
            }
            lcm++;
        }
    }
}

4

public class PerfectNumberCheck {

    public static boolean isPerfect(int number) {
        if (number < 2) return false;

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int num = 28;
        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}

5.

public class ArmstrongNumberCheck {
    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is NOT an Armstrong Number");
        }
    }
}

6.

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int num = 1; num <= 1000; num++) {
            int sum = 0, temp = num, digits = String.valueOf(num).length();
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}

7.
public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}

8.

public class StrongNumber {
    public static void main(String[] args) {
        int num = 145; 
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is NOT a Strong number.");
        }
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

9.

public class LeapYears {
    public static void main(String[] args) {
        System.out.println("Leap years between 1900 and 2025:");
        for (int year = 1900; year <= 2025; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(year + " ");
            }
        }
    }
}


