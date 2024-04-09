package day21;

import java.util.Scanner;

public class VoiceAssistantIntegration extends SmartHomeDevice {

	public VoiceAssistantIntegration(String type, boolean status) {
		super(type, status);
		
	}
	public void executevoice(String status) {
	 if(status=="turn on") {
		 super.turnon("voice assistant");
	 }
	 else if(status=="turn off") {
		 super.turnoff("voiceAssistant");
	 }
	 else if(status=="dim") {
		 System.out.println( "Adjusting brightness...");
	 }
	 else if(status=="set temperature") {
		 System.out.println("Setting temperature...");
	 }
	 else {
		System.out.println("Command not recognized."); 
	 }
	}

}
//if command contains "dim" then print "Adjusting brightness..."

//if command contains "set temperature" then print "Setting temperature..."

//Otherwise print "Command not recognized."