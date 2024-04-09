package day17;

public class Mainclass {
public static void main(String[] args) {
	

	// TODO Auto-generated constructor stub
	Driver d1=new Driver("ramu",45);
	Car c1=new Car("Bmw","A7",2023,d1);
	System.out.println(c1);
	
	Driver d2=new Driver("Alice",24);
	Car c2=new Car(c1);
	c1.changerdriver(d2);
	System.out.println(c1);
	
	
	
	System.out.println(c2);	
}
}
