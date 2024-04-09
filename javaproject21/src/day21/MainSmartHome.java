package day21;

public class MainSmartHome {
public static void main(String[] args) {
	VoiceAssistantIntegration v=new VoiceAssistantIntegration("voice", false);
	v.executevoice("turn on");
	v.executevoice("dim");
	v.executevoice("set temperature");
	v.executevoice("turn off");
}
}
