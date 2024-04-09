package day17;

public class Car {
	private String brand;
	 private String model;
	 private int year;
	 private Driver driver;
	public Car(String brand, String model, int year, Driver driver) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	
	public Car(Car c1) {
	 this.brand=c1.brand;
	 this.model=c1.model;
	 this.year=c1.year;
	 this.driver=c1.driver;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public Driver getDriver() {
		return driver;
	}
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", driver=" + driver + "]";
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	 public void changerdriver(Driver newdriver) {
		 this.driver=newdriver;
		 
	 }
}
