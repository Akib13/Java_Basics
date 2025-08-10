public class Oop {
	public static void main(String []args){

		// Object: A reference data type
				// An entity that holds data (attributes)
				// and can perform action (methods)
	
		Car car = new Car();

		System.out.println(car);
		System.out.println(car.model);
		System.out.println(car.price);
		System.out.println(car.isRunning);

		car.isRunning = true;
		System.out.println(car.isRunning);

		car.start();
		car.stop();
		System.out.println(car.isRunning);

		car.drive();
		car.brake();

		System.out.println("----------Constructor:---------");

		// constructor : A special method to initialize objects
						// initial values are set up by passing arguments.

		Student student1 = new Student("Ahmed", 25, 3.5);
		Student student2 = new Student("Khan", 28, 3.0);

		System.out.println(student1.name);
		System.out.println(student1.isEnrolled);
		System.out.println(student2.age);

		Student student3 = new Student("Haq", 22, 4.0);
		student3.study();

		// overloaded constructors = enable objects to be initialized in various ways.
		System.out.println("----------Overloaded Constructor:---------");

		User user1 = new User("Ahmed");
		User user2 = new User("Khan", "kh@gmail.com");
		User user3 = new User();

		System.out.println(user1.username);
		System.out.println(user1.email);
		System.out.println(user2.username);
		System.out.println(user2.email);
		System.out.println(user3.username);
		System.out.println(user3.email);

		// Array of objects
		System.out.println("----------Array of objects:---------");

		RaceCar car1 = new RaceCar("Mustang", "Red");
		RaceCar car2 = new RaceCar("Lambo", "Blue");
		RaceCar car3 = new RaceCar("Ford", "Yellow");

		RaceCar[] cars = {car1, car2, car3};

		for(int i = 0; i<cars.length; i++) {
			cars[i].drive();
		}

		// enhance for loop
		for(RaceCar racecar:cars){
			racecar.color = "Black";
		}

		for(RaceCar racecar:cars){
			racecar.drive();
		}

	}
}


