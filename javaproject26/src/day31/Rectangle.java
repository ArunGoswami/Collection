package day31;

public class Rectangle extends GeometricShape {
	 private  double width ;
	 private  double length;
	public Rectangle() {
		super();
		this.width = 10;
		this.length = 10;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double computeArea(double width, double height) {
		area=width*height;
		return area;
	}
	@Override
	public void show() {
		System.out.println("width"+width);
		System.out.println("length"+length);
		System.out.println(area+"area");
	}
	 
}
