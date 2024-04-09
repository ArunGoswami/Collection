package interfacePackage2;

public class test1 {
public static void main(String[] args) {
	Customer c=new Customer("c", 10000);
	c.deposit(new SBI(), 5000);
	c.withdraw(new SBI(), 2000);
}
}
