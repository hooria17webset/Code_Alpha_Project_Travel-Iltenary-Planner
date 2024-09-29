class Destination {
    private String name;
    private String startDate;
    private String endDate;
    private String preference;
    private double estimatedCost;

    // Constructor for initializing destination details
    public Destination(String name, String startDate, String endDate, String preference, double estimatedCost) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.preference = preference;
        this.estimatedCost = estimatedCost;
    }

    // Getter methods for retrieving destination details
    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getPreference() {
        return preference;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    // toString method to display destination details
    @Override
    public String toString() {
        return "Destination: " + name +
                "\nTravel Dates: " + startDate + " to " + endDate +
                "\nPreference: " + preference +
                "\nEstimated Cost: $" + estimatedCost;
    }
}
