package day21;

public class SmartHomeDevice {
	 private String type;
     private boolean status;
	public SmartHomeDevice(String type, boolean status) {
		super();
		this.type = type;
		this.status = status;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
     public void turnon(String value) {
    	 System.out.println(value+"is on");
     }
     public void turnoff(String value) {
    	 System.out.println(value+"is off");
     }
}
