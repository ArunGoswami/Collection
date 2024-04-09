package day18;

public class StudentTicket extends VIPTicket{
	private boolean studentDiscount;

	public StudentTicket(boolean studentDiscount, String specialAccess, int seatNumber, double price) {
		super(specialAccess, specialAccess, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	

	
	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	
	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}




	@Override
	public String toString() {
		return "StudentTicket [studentDiscount=" + studentDiscount + ", getSpecialAccess()=" + getSpecialAccess()
				+ ", toString()=" + super.toString() + ", getEventName()=" + getEventName() + ", getSeatNumber()="
				+ getSeatNumber() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
