package day21;

public class Lightdevice extends Home {
	public Lightdevice(String type, boolean status) {
	super(type, status);
	super.turnon("light");
	}
	public void dim(int brightness) {
		System.out.println( "Light brightness is set to " + brightness + "%.");
	}
	
}
