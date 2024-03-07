package CollectionPackage2;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetclass {
public static void main(String[] args) {
	TreeSet<Product> tr=new TreeSet<Product>((x,y)->x.id()-y.id());
     tr.add(new Product(3, "Anu"));
     tr.add(new Product(2, "Sonu"));
     tr.add(new Product(1, "Monu"));
     System.out.println(tr);
     
}
}
