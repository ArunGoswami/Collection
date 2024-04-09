package abst;
class Superb{
	public void show() {
		System.out.println("Superb method");
	}
}
public class Super{
	public static void main(String[] args) {
		
		
	Superb s=new Superb() {
	
		public void show() {
			System.out.println("super method");
		}
	
	};
	s.show();
	}
	
}
