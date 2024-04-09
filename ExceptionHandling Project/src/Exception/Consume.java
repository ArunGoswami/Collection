package Exception;

import java.util.function.Consumer;

public class Consume {
public static void main(String[] args) {
	Consumer<Integer> con=num->System.out.println("number is 10"+num);
	con.accept(10);
	
}
}
