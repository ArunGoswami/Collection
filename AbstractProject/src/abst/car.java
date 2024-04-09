package abst;

public abstract class car {
 String brand;
 String model;
 int mileage;
 int  top_speed;
 int yearOfManufacturing;
	public car() {
		carbrand();
		carMileage();
		carmodel();
		carTopSpeed();
		carYear();
		}
	 public String carbrand() {
		return this.brand="BMW";
		 
	 }
	 public String carmodel() {
			return this.model="one8";
			 
		 }
	 public int carMileage() {
			return this.mileage=20;
			 
		 }
	 public int carTopSpeed() {
			return this.top_speed=200;
			 
		 }
	 public int carYear() {
			return this.yearOfManufacturing=2020;
			 
		 }
	@Override
	public String toString() {
		return "car [brand=" + brand + ", model=" + model + ", mileage=" + mileage + ", top_speed=" + top_speed
				+ ", yearOfManufacturing=" + yearOfManufacturing + "]";
	}
	public abstract void display();
	 
	 
}

