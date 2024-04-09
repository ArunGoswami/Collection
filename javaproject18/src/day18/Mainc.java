package day18;

public class Mainc {
public static void main(String[] args) {
	Ticket t=new Ticket("A",123,5);
	VIPTicket v=new VIPTicket("d","A",123,5);
	StudentTicket s=new StudentTicket(false,"d",123,5);
	System.out.println(s);
}
}
