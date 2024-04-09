package InnerclassPackage;

public class Car {
Engine engine;

public Car(Engine engine) {
	super();
	this.engine = engine;
}
public void drive(int model) {
	if(model==0) {
		System.out.println("Engine started");
	}
	else if(model==1) {
		System.out.println("Engine fail try once again");
	}
	else if(model==2) {
		System.out.println("Need Servicing!!!!");
	}
	else {
		System.out.println("invalid input");
	}
}
}
