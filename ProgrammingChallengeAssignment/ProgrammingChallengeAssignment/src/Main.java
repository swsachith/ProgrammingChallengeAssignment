
public class Main {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car("Posche", "Caymen S");
		vehicle1.drive();
		System.out.println("this vehicle has "+vehicle1.getNumber_of_tires()+" tires :)");
	}
}
