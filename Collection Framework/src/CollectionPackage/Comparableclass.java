package CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;

class Productclass implements Comparable<Productclass>{
	private Integer productNumber;
	private String productName;
   private Double 	productPrice;
public Productclass(Integer productNumber, String productName, Double productPrice) {
	super();
	this.productNumber = productNumber;
	this.productName = productName;
	this.productPrice = productPrice;
}

@Override
public String toString() {
	return "Productclass [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
			+ productPrice + "]";
}

@Override
public int compareTo(Productclass o) {
	// TODO Auto-generated method stub
	return this.productNumber-o.productNumber;
}

}
public class Comparableclass {
public static void main(String[] args) {
	ArrayList<Productclass> al=new ArrayList<Productclass>();
	al.add(new Productclass(1, "fan", 2000.0));
	al.add(new Productclass(2, "mobile", 10000.0));
	al.add(new Productclass(3, "charger", 1000.0));
	Collections.sort(al);
//	al.forEach(a->System.out.println(a));
	System.out.println(al);
	
}
}
