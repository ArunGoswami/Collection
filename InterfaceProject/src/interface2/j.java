package interface2;

package interface2;

public interface f {
//public static void main() {
//	System.out.println("main meethod");
//}
public static int main1() {
	System.out.println("main meethod1");
	return 0;
}
}
class g implements f{
	public static void main(String[] args) {

	   f.main1();
	}
}
