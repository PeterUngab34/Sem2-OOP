public class Vehicle {
    // Attributes for Vehicle
    private String brand;
    private String model;
    private double pricePerDay;

    // Constructor for Vehicle
    public Vehicle(String brand, String model, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price per Day: $" + pricePerDay);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an ElectricCar object
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model S", 150.0, 100.0);

        // Call the overridden displayDetails() method
        myElectricCar.displayDetails();

        // Call the additional displayBatteryInfo() method
        myElectricCar.displayBatteryInfo();
    }
}
