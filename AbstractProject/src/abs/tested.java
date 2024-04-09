package abs;
abstract class Animal{
public abstract void checkanimal();
}
class Lion extends Animal{

	@Override
	public void checkanimal() {
	System.out.println("animal");
}
	}
	class Dog extends Animal{
	    @Override
		public void checkanimal() {
			// TODO Auto-generated method stub
			
		}
}
	class Bird extends Animal{

		@Override
		public void checkanimal() {
			// TODO Auto-generated method stub
			
		}
	}
	public class tested{
		public static void main(String[] args) {
			
		Lion lion[]={new Lion(),new Lion(),new Lion()};
		checkanimal(lion);
		}
		public static void checkanimal(Animal []animals) {
			for(Animal animal:animals) {
				animal.checkanimal();
			}
		}
	}
	
