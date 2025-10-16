
2.

public class OddNumbers {
    public static void main(String[] args) {
        for (int a = 51; a < 100; a += 2) {
            System.out.println(a);
        }
    }
}

3.

public class Countdown {
    public static void main(String[] args) {
        for (int a = 100; a >= 1; a--) {
            System.out.println(a);
        }
    }
}


5.

public class MultiplesOfThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

6.

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

7.

public class CountDivisibleBy7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println("Count of numbers divisible by 7 between 1 and 100: " + count);
    }
}

8.

public class SumFirst50Numbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Sum of the first 50 natural numbers: " + sum);
    }
}

9.

public class ProductFirst10Numbers {
    public static void main(String[] args) {
        long product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of the first 10 natural numbers: " + product);
    }
}


11.

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7; 
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

12.

public class PrintCharacters {
    public static void main(String[] args) {
        String str = "Good, Morning!";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}



16.

public class VowelCounter {
    public static void main(String[] args) {
        String input = "Beautiful Day";
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Number of vowels: " + count);
    }
}






