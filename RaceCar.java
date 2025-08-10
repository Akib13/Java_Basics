public class RaceCar {
	String model;
	String color;

	RaceCar(String model, String color) {
		this.model = model;
		this.color = color;
	}

	void drive() {
		System.out.println("Driving the " + this.color + " " + this.model);
	}
}