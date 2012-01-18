public class Vehicle {
	private String model;
	private String brand;
	private int number_of_tires;

	

	public String getModel() {
		return model;
	}

	public int getNumber_of_tires() {
		return number_of_tires;
	}

	public void setNumber_of_tires(int number_of_tires) {
		this.number_of_tires = number_of_tires;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void drive() {
		System.out.println("I'm driving my self..!!!");
	}

}
