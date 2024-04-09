package abs;

abstract class Shaped {
int data;

public Shaped(int data) {
	super();
	this.data = data;
}
public abstract void area();
}

class circled extends Shaped{

	circled(int data){
		super(data);
	}


	@Override
	public void area() {
		System.out.println("dfghj"+data*data);
	}
	
}

class rectangle extends Shaped{

	int breadth;

	public rectangle(int length,int breadth) {
		super(length);
		this.breadth=breadth;
	}

   @Override
	public void area() {
		System.out.println("dfghj"+data*breadth);
	}
	
}
public class manit{
	public static void main(String[] args) {
		rectangle r=new rectangle(5, 5);
		r.area();
		circled c=new circled(5);
		c.area();
		
	}
}