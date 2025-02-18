package vehichelrentalsystem;

public class VehichelRentalSystem {
    public static void main(String[] args) {
        
        Vehicle[] vehicles = new Vehicle[4];
        
        vehicles[0] = new car("Nissan", "Navara", 50.0, 4);
        vehicles[1] = new truck("Ford", "Ranger", 80.0, 2.5);
        vehicles[2] = new MotorCycle("Ducati", "V4 SP", 40.0, true);
        vehicles[3] = new electricCar("BYD", "DOLPHIN", 100.0, 2, 5000);
        
        int rentalDays = 5; 
        double discountPercentage = 10; // 10% discount
        
        
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental price for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));
            
            
            System.out.println("Discounted Rental price for " + rentalDays + " days: $" + v.calculateDiscountedRentalCost(rentalDays, discountPercentage));
              v.performMaintenance();
            System.out.println("-----------------------------");
        }
    }
}
