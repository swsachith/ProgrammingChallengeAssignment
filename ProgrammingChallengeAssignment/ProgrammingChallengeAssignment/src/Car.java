public class Car extends Vehicle {
	private boolean neonLightsOn;

	public void drive() {
		System.out.print("me:(a car) " + this.getBrand() + " "
				+ this.getModel() + " is driving by my self");
		if (isNeonLightsOn())
			System.out.print(" With Neons ON...>!!!!");
		System.out.println();
	}

	public boolean isNeonLightsOn() {
		return neonLightsOn;
	}

	public Car(String brand, String model) {
		this.setBrand(brand);
		this.setModel(model);
		this.setNumber_of_tires(4);
	}

	public void setNeonLightsOn(boolean neonLightsOn) {
		this.neonLightsOn = neonLightsOn;
	}

}
