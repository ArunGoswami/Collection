package day17;

public class Testc {
public static void main(String[] args) {
	Address address=new Address(123,"bhopal","nh");
	student sonu=new student("sonu",123,"bca",address);
	Faculty ravi=new Faculty("ravi",123,30000,address);
	System.out.println(sonu);
System.out.println(ravi);
}
}
