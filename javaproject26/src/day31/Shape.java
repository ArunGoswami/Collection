package day31;

public class Shape {
	Shape(){
		
	}
	public static Shape randshape() {
		switch ((int) (Math.random()*3))
		{
	case 0: 
    Circle c =new Circle();
    break;
    
	case 1:
		Square s =new Square();
		break;
	case 2:
		Triangle t =new Triangle();
		break;

	default: 
		System.out.println("invalid");
	}
		return new Shape();
	}
	public void show() {
		System.out.println();
		System.out.println();
	}
	public void erase() {
		System.out.println();
		System.out.println();
	}
}
