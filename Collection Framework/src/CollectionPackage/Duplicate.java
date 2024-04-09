package CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Duplicate {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(3);
	System.out.println(a);
	Collections.sort(a);
	for(int i=0; i<a.size(); i++)
	{
		int c=0;
    for(int j=0; j<a.size(); j++) {
    	if(a.get(i)==a.get(j)) {
    		c++;
    	}
    	
    }if(c>1)
		System.out.println(a.get(i));
    i=i+c-1;
    }
}
}
