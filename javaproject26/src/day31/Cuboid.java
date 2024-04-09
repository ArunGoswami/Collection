package day31;

public class Cuboid extends GeometricShape {
	private double height;
	private int width;
	private int length;

	public Cuboid(double width, double height, double length) {
		super();
		this.height = height;
		this.width = 15;
		this.length = 15;
	}

	
	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	public double computeArea(double width, double height, double length) {
		super.computeArea(height, length);
		return width*super.computeArea(height, length);
	}
	@Override
	public void show() {
		System.out.println(area);
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	}
}
