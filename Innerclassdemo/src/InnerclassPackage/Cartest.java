package InnerclassPackage;

public class Cartest {
public static void main(String[] args) {
	Engine e1=new MockSuccessEngine();
	Car car=new Car(e1);
	Engine e2=new MockFailAndRetryEngine();
	Car car1=new Car(e2);
	Engine e3=new MockServicingEngine();
	Car car2=new Car(e3);
	car.drive(e2.mode());
	//car1.drive(e2.mode());
}
}
