package TravelItineraryPlannerroject;

import java.util.ArrayList;

public class Destination {
String name;
ArrayList<Activity> ActivitiesList;
public Destination(String name, ArrayList<Activity> activitiesList) {
	super();
	this.name = name;
	ActivitiesList = activitiesList;
}
public void addactivities(Activity activity) {
	ActivitiesList.add(activity);
}

public void Retrieveactivities() {
	for(Activity existactivity:ActivitiesList) {
		System.out.println(existactivity);
	}
	
}
@Override
public String toString() {
	return "Destination [name=" + name + ", ActivitiesList=" + ActivitiesList + "]";
}
}
