package CollectionPackage;

import java.util.TreeSet;

public class CollectionExample1 {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("A");
		tree.add("37");
		for(String str: tree)
			System.out.print(str+" ");
	}
}