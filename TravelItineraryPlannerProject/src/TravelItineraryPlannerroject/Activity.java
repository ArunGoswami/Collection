package TravelItineraryPlannerroject;

public class Activity {
   String	name;
   String schedule;
public Activity(String name, String schedule) {
	super();
	this.name = name;
	this.schedule = schedule;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the schedule
 */
public String getSchedule() {
	return schedule;
}
/**
 * @param schedule the schedule to set
 */
public void setSchedule(String schedule) {
	this.schedule = schedule;
}
@Override
public String toString() {
	return "Activity [name=" + name + ", schedule=" + schedule + "]";
}
   
}
