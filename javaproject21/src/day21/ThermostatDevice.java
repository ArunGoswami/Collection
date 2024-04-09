package day21;

public class ThermostatDevice extends Home{
	public ThermostatDevice(String type,Boolean Status) {
		super(type,Status);
		super.turnon("termostat");
	}
	public void tempreture(int temperature) {
		System.out.println("Thermostat temperature is set to " + temperature + "°C."

);
	}
	

}
