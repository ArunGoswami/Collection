package Inter;

interface Alpha{
void sum() ;
}
interface Beta{
void sum() ;
}

class gamma implements Alpha,Beta {

	@Override
	public void sum() {
		System.out.println("fghjk");
		
	}

}
public class testa {
	public static void main(String[] args) {
		gamma a=new gamma();
		a.sum();
	}
}
