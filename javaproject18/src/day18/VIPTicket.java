package day18;

public class VIPTicket extends Ticket {
	private String specialAccess;

	public VIPTicket(String specialAccess, String eventName, int seatNumber,double price) {
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
	}

	/**
	 * @return the specialAccess
	 */
	public String getSpecialAccess() {
		return specialAccess;
	}

	/**
	 * @param specialAccess the specialAccess to set
	 */
	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}

	@Override
	public String toString() {
		return "VIPTicket [specialAccess=" + specialAccess + "]";
	}
   
	
	
}
