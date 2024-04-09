package day20;

public class circle extends Shapes {


circle(int radius){
	super(radius);
}
public void getArea() {
	double area=getData()*getData();
	System.out.println(area);
}
	

}
