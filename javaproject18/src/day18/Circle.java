package day18;
class Circl 
{
	double radius;
	Circl() 
	{

	}

	Circl(double radius) 
	{
		super();
		this.radius = radius;
	}

	public double getCircle() 
	{
		double Circle = 3.147 * radius;
		if (radius > 0) {
			return Circle;
		} else {
			return -1;
		}
	}
}

class Cylinder extends Circl {
	double height;

	Cylinder() {

	}

	Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
	}

	public double getvolume() {
		double volume = 3.147 * radius * height;
		if (height > 0) {
			return volume;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + radius + "]";
	}

}

public class Circle {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(5.0, 5.0);
		System.out.println(c.getCircle());
		System.out.println(c.getvolume());
		System.out.println(c);
	}
}
