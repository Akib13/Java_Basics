import java.util.Scanner;
import java.util.Random;

public class Basic{
	public static void main (String []args) {

		// first output with comment
		System.out.println("Hello World");

		// Variable  = a reusable container for a value
		//				a variable behaves as if it was the value it contains

		/*
			Primitive = simple value stored directly in memory (stack)
			e.g.: int, double, char, boolean

			Referemce = memory address (stack) that points to the heap.

			e.g.: string, array, object
		*/

		int age = 30;
		double price = 19.99;
		char grade = 'A';
		boolean isStudent = true;
		System.out.println(age + ", " + price + ", " + grade + ", " + isStudent);

		String name = "Test name";
		System.out.println(name);


		// User input in java
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String userName = scanner.nextLine(); // string input
		// scanner.next() does not take any words after a space.
		System.out.println("Hello, " + userName);


		System.out.print("Enter your age: ");
		int userAge = scanner.nextInt(); // integer input
		System.out.println("Hello, " + userAge);

		// nextDouble() -> for double input
		// nextBoolean() -> for boolean input

		// Using nextLine() after nextInt() or similar function, the input is \n. So we have to give an extra nextLine() to capture the string input.

		System.out.print("Enter your favorite color: ");
		scanner.nextLine();
		String favColor = scanner.nextLine();
		System.out.println("The color is, " + favColor);


		// Operations:
		double result = 3 + 4 * (7-5) / 2.0;
		System.out.println(result);

		// Random numbers generator
		Random random = new Random();

		int number;
		number = random.nextInt(1, 6); // numbers from 1 to 5
		// random.nextDouble();  //generates random double numbers
		System.out.println(number);


		// Math class
		System.out.println(Math.PI);

		double result1 = Math.pow(2,3);
		System.out.println(result1);
		System.out.println(Math.round(3.14));

		// Printf()- method to format output. Same behavior of C.
		System.out.printf("You are %d years old.\n", age);


		
		scanner.close();
	}
}