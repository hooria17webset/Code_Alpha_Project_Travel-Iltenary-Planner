import java.util.ArrayList;



class TravelItinerary {
    private ArrayList<Destination> destinations; // List to store destinations

    // Constructor to initialize the destination list
    public TravelItinerary() {
        destinations = new ArrayList<>();
    }

    // Method to add a new destination to the itinerary
    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    // Method to display the complete itinerary
    public void displayItinerary() {
        System.out.println("----- Travel Itinerary -----");
        for (Destination destination : destinations) {
            System.out.println(destination); // Use toString() method of Destination class
        }
        System.out.println("Total Estimated Cost: $" + calculateTotalCost());
    }

    // Method to calculate the total cost of the entire trip
    private double calculateTotalCost() {
        double totalCost = 0;
        for (Destination destination : destinations) {
            totalCost += destination.getEstimatedCost();
        }
        return totalCost;
    }
}

// Main class to interact with the user