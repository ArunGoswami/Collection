package day31;

public class test {
public static void main(String[] args) {
	Rectangle r=new Rectangle();
	r.computeArea(15, 15);
	r.show();
	Cuboid c=new Cuboid(15, 15, 15);
	c.computeArea(15, 15, 15);
	c.show();
}
}
