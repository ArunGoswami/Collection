package day21;

public class Home {
	private String type;
	private boolean status;
	public Home(String type, boolean status) {
		super();
		this.type = type;
		this.status = status;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Home [type=" + type + ", status=" + status + "]";
	}
	
	public void turnon(String value) {
		System.out.println(value+"Light is  turn on");
		
	}
	
	public void turnoff(String value) {
		System.out.println(value+"turn off");
	}
	
}
