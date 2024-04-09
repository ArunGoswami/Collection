package day21;

public class MainSmart {
public static void main(String[] args) {
	Lightdevice l=new Lightdevice("red", true);
	l.dim(20);
	ThermostatDevice t=new ThermostatDevice("white",true);
	t.tempreture(50);
  t.turnoff("light");
  t.turnoff("thermostat");
	
	
}
}
