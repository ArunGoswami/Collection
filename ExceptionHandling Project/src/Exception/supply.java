package Exception;

import java.util.function.Supplier;

public class supply {
public static void main(String[] args) {
	Supplier<Integer> sup=()->12*12;
	System.out.println(sup.get());
	
	
}
}
