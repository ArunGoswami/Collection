package abs;

abstract class Alpha{
	public abstract void show();
	public abstract void draw();
	
}
abstract class beta extends Alpha{

	@Override
	public void show() {
		System.out.println("beta");
		
	}
	
}
class gamma extends beta{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("gamma");
		super.show();
	}

}
public class Mainer {
public static void main(String[] args) {
	gamma g=new gamma();
	g.draw();
}
}
