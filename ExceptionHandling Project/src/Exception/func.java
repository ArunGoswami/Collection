package Exception;

import java.util.function.Function;

public class func {
public static void main(String[] args) {
	Function<Integer,Integer> fun=num->num*num;
	System.out.println(fun.apply(12));
}
}
