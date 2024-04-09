package abs;

abstract class Shape{
	int data;
	Shape(int data){
		
	}
	public abstract void draw();
}
class circle extends Shape{


	public circle(int data) {
		super(data)
	}
	
	public void area() {
		System.out.println(""+data*data);
		
	}
	
}

class square extends Shape{

	square(int data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
	  System.out.println("Square draw");
	}
}

public class Main {
public static void main(String[] args) {
	Shape s=new square(); 
	s.draw();
//	Shape s1=new circle();
//	s1.draw();
}
}
