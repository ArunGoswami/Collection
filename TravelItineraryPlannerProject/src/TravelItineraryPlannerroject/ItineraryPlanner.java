package TravelItineraryPlannerroject;

import java.util.ArrayList;

public class ItineraryPlanner {
	
ArrayList<Destination> destinationslist=new ArrayList<Destination>();


	public ItineraryPlanner(ArrayList<Destination> destinationslist) {
	super();
	this.destinationslist = destinationslist;
}

	public void addactivities(Destination destination) {
		destinationslist.add(destination);
	}

	public void Retrieveactivities() {
		for(Destination destination:destinationslist) {
			System.out.println(destination);
		}
}
}