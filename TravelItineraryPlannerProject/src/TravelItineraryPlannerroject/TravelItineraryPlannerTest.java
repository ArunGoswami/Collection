package TravelItineraryPlannerroject;

import java.util.ArrayList;

public class TravelItineraryPlannerTest {
public static void main(String[] args) {
	ItineraryPlanner itineraryPlanner=new ItineraryPlanner(new ArrayList<Destination>());
	Destination paris=new Destination("Paris",  new ArrayList<Activity>());
	Destination london=new Destination("london", new ArrayList<Activity>());
	london.;
	itineraryPlanner.addactivities(london);
	itineraryPlanner.addactivities(paris);
	
	itineraryPlanner.Retrieveactivities();
	
}
}
