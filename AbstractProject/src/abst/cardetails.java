package abst;

public class cardetails extends car {
public static void main(String[] args) {
	
     cardetails c=new cardetails();
     System.out.println(c);
     c.display();
	}

@Override
public void display() {
	System.out.println(super.carmodel());
	System.out.println(super.carbrand());
	System.out.println(super.carMileage());
	System.out.println(super.carTopSpeed());
	System.out.println(super.carYear());
}





}
