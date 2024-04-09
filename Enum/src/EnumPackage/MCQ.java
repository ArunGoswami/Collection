package EnumPackage;

import java.util.Vector;
import java.util.function.Predicate;

public class MCQ {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>(2, 12);
		v.add(10);
		v.add('A');
		v.add(60.f);
		v.add(30);
		v.add(50.5);
		v.add(90);
		v.add('a');
		Predicate<Object> p = (x) -> {
			int i = (Integer)x;
			if(i>=50) {
				return true;
			}
			return false;
		};
		Vector<Object> res = new Vector<>();
		for(Object o : v) {
			if(p.test(o)) res.add(o);
		}
		System.out.println(res);

	}
}
