public class Car {
	String make = "Ford";
	String model = "Mustang";
	int year = 2025;
	double price = 50000;
	boolean isRunning = false;

	void start() {
		isRunning = true;
		System.out.println("Car Started");
	}

	void stop() {
		isRunning = false;
		System.out.println("Car Stopped");
	}

	void drive() {
		System.out.println("Driving the " + model);
	}

	void brake() {
		System.out.println("Braking the " + model);
	}

}