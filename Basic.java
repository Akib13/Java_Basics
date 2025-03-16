import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

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


		// *** string methods
		String str1 = "Akib Ahmed";
		int length = str1.length();
		System.out.println(length); // output = 10

		char letter = str1.charAt(0);
		System.out.println(letter); // output = A

		int index = str1.indexOf("A");
		System.out.println(index); // output = 0

		int lastIndex = str1.lastIndexOf("A");
		System.out.println(lastIndex); // output = 5

		// different functions demonstration
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.trim()); // remove spaces from the beginning
		System.out.println(str1.replace("e", "a"));
		System.out.println(str1.isEmpty());

		if(str1.contains(" ")) {
			System.out.println("Has a space in str1.");
		}

		if(str1.equals("Akib Ahmed")) {
			System.out.println("Correct");
		}
		// str1.equalsIgnoreCase("Akib Ahmed")


		// *** substring() method = used to extract a portion of a string. syntax: .substring(start, end)
		String email = "akib12@gmail.com";
		String username = email.substring(0, 6);
		String domain = email.substring(email.indexOf("@") + 1);
		System.out.println(username+ " with "+ domain);


		// ternary operator ? = Return 1 of 2 values if a condition is true.

		// variable = (condition) ? ifTrue : ifFalse;

		int score = 70;
		String passOrFail = (score >= 60) ? "Pass" : "Fail";
		System.out.println(passOrFail);


		// Switch statements
		String day = "Monday";
		switch(day) {
			case "Monday" -> System.out.println("Day 1");
			case "Tuesday" -> System.out.println("Day 2");
			case "Friday", "Saturday" -> System.out.println("Weekend");
			default -> System.out.println("Day not available");
		}

		// logical operators: AND = &&, OR = ||, NOT = !

		// method = a block of reusable code executed when called
		System.out.println("-----Methods--------");
		happyBirthday(userName, userAge);
		double num = square(3);
		System.out.println(num);

		// overloaded method = method that share same name, but different parameters

		System.out.println(add(1,2));
		System.out.println(add(1,2,3));

		// variable scopes : LOCAL and CLASS
		func1();
		int x = 1; // Local variable
		System.out.println(x);

		// array: collection of elements with a same data type
		System.out.println("-----Array--------");

		int[] numbers = {1,2,3};
		System.out.println(numbers[0]);
		// numbers[4] will give me error
		numbers[0] = 10;
		System.out.println(numbers[0]);

		int numOfArray = numbers.length;
		System.out.println(numOfArray);

		// sorting arrays
		Arrays.sort(numbers);

		// filling elements with a value
		Arrays.fill(numbers, 0);

		// access array elements with for each loop
		for(int elemNum: numbers) {
			System.out.println(elemNum);
		}

		// user input with arrays:

		// creating array with a fixed size
		String[] foods = new String[3];
		System.out.println(foods.length);

		for(int i = 0; i < foods.length; i++) {
			System.out.print("Enter a food: ");
			foods[i] = scanner.nextLine();
		}

		for(String food: foods) {
			System.out.println(food);
		}

		// search an array element

		int[] ages = {10, 20, 15, 24};
		int target = 24;
		for(int i = 0; i < ages.length; i++) {
			if(target == ages[i]) {
				System.out.println("Element found at index: " +i);
				break;
			}
		}

		scanner.close();

		// varargs = allow a method to accept varying # of arguments
		System.out.println(newAdd(1,2));
		System.out.println(newAdd(1,2,3,4,5));


		// 2D array = An array where each element is an array
		// arr[row][col];

		System.out.println("-----------2D array------------");

		String[] fruits = {"apple", "orange", "banana"};
		String[] vegetables = {"potato", "onion", "carrot"};
		String[] meats = {"chicken", "beef", "fish"};

		String[][] groceries = {fruits, vegetables, meats};

		groceries[1][2] = "tomato";

		for(String[] items:groceries) {
			for (String item:items){
				System.out.print(item + " ");
			}
			System.out.println();
		}

	}

	static void happyBirthday(String name, int age) {
		System.out.println("Happy Birthday to you");
		System.out.println(name + age);
		System.out.println("Happy Birthday to you");
	}

	static double square(double number) {
		return number * number;
	}

	static int add(int a, int b){
		return a+b;
	}

	static int add(int a, int b, int c){
		return a+b+c;
	}

	static int x = 3; // class variable

	static void func1(){
		int x = 2; // Local variable
		System.out.println(x);
	}

	static int newAdd(int... numbers) {
		System.out.println(numbers);

		int sum = 0;

		for(int number:numbers){
			sum += number;
		}

		return sum;
	}

}