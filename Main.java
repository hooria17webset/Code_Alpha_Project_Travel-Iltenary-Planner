import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // For user input
        TravelItinerary itinerary = new TravelItinerary(); // Create a new TravelItinerary instance

        System.out.println("Welcome to the Travel Itinerary Planner!");

        // Loop for collecting destination details from the user
        while (true) {
            // Prompt for destination name or exit condition
            System.out.print("\nEnter destination name (or type 'exit' to finish): ");
            String destinationName = scanner.nextLine();
            if (destinationName.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types "exit"
            }

            // Collect start date from the user
            System.out.print("Enter start date (YYYY-MM-DD): ");
            String startDate = scanner.nextLine();

            // Collect end date from the user
            System.out.print("Enter end date (YYYY-MM-DD): ");
            String endDate = scanner.nextLine();

            // Collect user preference (e.g., beach, mountain, city)
            System.out.print("Enter your preference (e.g., beach, mountain, city): ");
            String preference = scanner.nextLine();

            // Collect estimated cost from the user
            System.out.print("Enter estimated cost for this destination: ");
            double estimatedCost = scanner.nextDouble();
            scanner.nextLine(); // Consume leftover newline character after reading double

            // Create a new Destination object and add it to the itinerary
            Destination destination = new Destination(destinationName, startDate, endDate, preference, estimatedCost);
            itinerary.addDestination(destination); // Add destination to itinerary
        }

        // Display the complete travel itinerary after user finishes input
        System.out.println("\nHere is your travel itinerary:");
        itinerary.displayItinerary();
    }}
