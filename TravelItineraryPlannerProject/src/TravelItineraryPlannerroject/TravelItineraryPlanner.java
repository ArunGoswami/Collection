package TravelItineraryPlannerroject;

import java.util.ArrayList;
import java.util.List;

class Activity {
    private String name;
    private String schedule;

    public Activity(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "- " + name + " (" + schedule + ")";
    }
}

class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    // Add activity to the destination
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    // Get activities for the destination
    public List<Activity> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Destination: " + name + "\n");
        for (Activity activity : activities) {
            result.append(activity.toString()).append("\n");
        }
        return result.toString();
    }
}

class ItineraryPlanner {
    private List<Destination> destinations;

    public ItineraryPlanner() {
        this.destinations = new ArrayList<>();
    }

    // Add destination to the itinerary planner
    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    // Get destinations in the itinerary planner
    public List<Destination> getDestinations() {
        return destinations;
    }
}

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        // Create an instance of ItineraryPlanner
        ItineraryPlanner itineraryPlanner = new ItineraryPlanner();

        // Create two Destination objects
        Destination paris = new Destination("Paris");
        Destination london = new Destination("London");

        // Add activities to each destination
        paris.addActivity(new Activity("Visit Eiffel Tower", "Morning"));
        paris.addActivity(new Activity("Louvre Museum", "Afternoon"));

        london.addActivity(new Activity("British Museum", "Morning"));
        london.addActivity(new Activity("London Eye", "Afternoon"));

        // Add destinations to the itinerary planner
        itineraryPlanner.addDestination(paris);
        itineraryPlanner.addDestination(london);

        // Display the itinerary
        List<Destination> destinations = itineraryPlanner.getDestinations();
        for (Destination destination : destinations) {
            System.out.println(destination);
        }
    }
}

