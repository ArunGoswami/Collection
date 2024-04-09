package day17;

public class Testd {
public static void main(String[] args) {
	Customer sonu=new Customer("sonu",123,"bhopal");
	Customer monu=new Customer(sonu);
	sonu.setEmailAddress("Indore");
	System.out.println(sonu);
	System.out.println(monu);
}
}
