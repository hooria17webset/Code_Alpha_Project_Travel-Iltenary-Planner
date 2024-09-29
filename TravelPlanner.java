import java.util.ArrayList;
import java.util.Scanner;



public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelItinerary itinerary = new TravelItinerary();

        System.out.println("Welcome to the Travel Itinerary Planner!");

        while (true) {
            // Get destination name or exit condition
            System.out.print("\nEnter destination name (or type 'exit' to finish): ");
            String destinationName = scanner.nextLine();
            if (destinationName.equalsIgnoreCase("exit")) {
                break; // Exit the loop when the user types "exit"
            }

            // Collecting additional information about the destination
            System.out.print("Enter start date (YYYY-MM-DD): ");
            String startDate = scanner.nextLine();

            System.out.print("Enter end date (YYYY-MM-DD): ");
            String endDate = scanner.nextLine();

            System.out.print("Enter your preference (e.g., beach, mountain, city): ");
            String preference = scanner.nextLine();

            System.out.print("Enter estimated cost for this destination: ");
            double estimatedCost = scanner.nextDouble();
            scanner.nextLine(); // Consume the leftover newline character after nextDouble()

            // Create a new Destination object and add it to the itinerary
            Destination destination = new Destination(destinationName, startDate, endDate, preference, estimatedCost);
            itinerary.addDestination(destination);
        }

        // Display the complete itinerary
        System.out.println("\nHere is your travel itinerary:");
        itinerary.displayItinerary();
    }
}