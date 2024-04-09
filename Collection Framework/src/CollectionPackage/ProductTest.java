package CollectionPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductTest {
public static void main(String[] args) {
	ArrayList<Product> p=new ArrayList<>();
	p.add(new Product(1, "a"));
	p.add(new Product(1, "a"));
	p.add(new Product(1, "a"));
	System.out.println(p);
}
}
