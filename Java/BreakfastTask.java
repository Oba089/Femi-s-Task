public class ReversedString {
     public static void main(String[] args) {
        String originalStr = "Oluwasegun";
        String reversedStr = reverseString(originalStr);


        for (int word = str.length() - 1; word => 0; word--) {
            reversed.append(str.char());
        }
        return reversed.toString();
    }
        System.out.println("Word string: " + wordStr);
        System.out.println("Reversed string: " + reversedStr);
 
}

public class AverageNumbers{
	public static void main(String [] args){
	
	int average = 0;
	int sum = 0;
	int counter = 0;
	for(int count = 1; count <= 100 ; count++){
		sum += count;
		counter++;
	}
	average = sum / counter;
	System.out.print(average);
}
}


public class Binary{
	public static void main(String [] args){

String number = "100";
int power = 1;
int sum = 0;

	int convertedNumber = Integer.parseInt(number);

	while(convertedNumber > 0){
		int remainder = convertedNumber % 10;
		 sum += remainder * power;
		power = power * 2;  
		convertedNumber /= 10;	
		
	}
	System.out.print(sum);

}
}

public class DecimalToBinary{
	public static void main(String [] args){

int number = 5;
String dividedNumber = "";

	while(number > 0){
		int remainder = number % 2;
		 dividedNumber += remainder ;
		 number /= 2;	
		
	}
	System.out.print(dividedNumber);
}
}

public class DivisorCount{
	public static void main(String [] args){
		
	int number = 10;
	int divisor = 2;
	int divisorCount = 0;
	
	while(number > 1){
		if(number % divisor == 0){
			number = number / divisor;
		}
		else{
			divisor++;
		}
		divisorCount++;
	}

	System.out.println(divisorCount);

}
}

public class Divisors{
	public static void main(String [] args){
		
	int number = 10;
	int divisor = 2;
	
	while(number > 1){
		if(number % divisor == 0){
		number = number / divisor;
		}
		else{
			divisor++;
		}
		System.out.println(divisor);
	}
	}
}
	
public class Fibonnacci{
	public static void main(String [] args){

		int nextNumber = 0;
		
		for (int index = 0; index < 20; index++) {
			int sum = index + nextNumber;
			System.out.println(sum);
			nextNumber = index;
		}
}
}


public class Palindrome{
	public static void main(String [] args){
	
int number = 121;
int store = number;

String reversed = "";

	while(number > 0){
	
	int dividedNumber = number % 10;
	reversed += dividedNumber;
	number /= 10;

	}

	int convertedNumber = Integer.parseInt(reversed);

	if(store == convertedNumber){
		System.out.print("It is a palindrome");
	}
	else{
	System.out.print("it is not a palindrome");
	}

}
}

public class PalindromeString{
	public static void main(String [] args){
	
String name = "segun";
String store = " ";

String letters = "";

		for(int count = name.length() - 1 ; count >= 0; count--){
			letters += String.valueOf(name.charAt(count));
		}
		
		if(name.equals (letters)){
			System.out.print("It is a palindrome");
		}
		else{
			System.out.print("It is not a palindrome");
		}
}
}

import java.util.Arrays;
public class PositionVowel{
	public static void main(String [] args){
	
	String name = {"Oluwasegun"}
	String [] position = new String [name.length];
	String vowel = "aeiou";

	for(int count = 0; count < name.length; count++){
		position [count] = name[count]
	}
}
}

public class PrimeNumbers{
	public static void main(String [] args){

	int divisor = 2;
	int number = 100;

	for(int count = 2; count < number; count++){
		if(number % count == 0){
			System.out.print(number);
		}
	}
}
}

public class PrimeNumbersCount{
	public static void main(String [] args){

	int divisor = 2;

	int primeCount = 0;
	for(int count = 2; count < 100; count++){
		if(count % divisor == 0){
			primeCount++;
		}
	System.out.print(primeCount);
			
	}
}
}

public class ReverseString{
	public static void main(String [] args){

String name = "Oluwasegun";

	for(int count = name.length() - 1; count >= 0 ; count--){
		char letters = name.charAt(count);
		System.out.println(letters);

	}

}
}

public class ReversedInteger{
	public static void main(String [] args){
	
int number = 56789;
String reversed = "";

	while(number > 0){
	
	int dividedNumber = number % 10;
	reversed += dividedNumber;
	number /= 10;

	}
	System.out.print(reversed);

}
}

public class SumEvenDigits{
	public static void main(String [] args){

	int number = 56789;

	int sum = 0;

	while(number > 0 ){
	int dividedNumber = number % 10;
	if(dividedNumber % 2 == 0){
		sum += dividedNumber;
	}
		number /= 10;
		
	}
	System.out.print(sum);
	
}
}

public class SumOddDigits{
	public static void main(String [] args){

	int number = 56789;

	int sum = 1;

	while(number > 0 ){
	int dividedNumber = number % 10;
	if(dividedNumber % 2 == 1){
		sum = sum + dividedNumber;
	}
		number /= 10;

		
	}
	System.out.print(sum);
	
}
}