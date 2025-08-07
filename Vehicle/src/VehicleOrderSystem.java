import java.util.*;

public class VehicleOrderSystem {

    private VehicleInventory inventory;

    public VehicleOrderSystem() {
        inventory = new VehicleInventory();
    }
    public void placeOrder(String vehicle, Map<String, Object> desiredFeatures) {
        Vehicle v = inventory.checkAvailableVehicle(vehicle, desiredFeatures);
        if (v != null) {
            v.setAvailable(false);
            double price = v.calculatePrice(); // Polymorphic call
            System.out.println("Vehicle reserved: " + v.getRegistrationNumber());
            System.out.println("Total price: $" + price);
        } else {
            System.out.println("No available vehicle matches your criteria.");
        }
    }
    // Method to reserve a vehicle
    public void reserveVehicle(String vehicle, Map<String, Object> desiredFeatures) {
        Vehicle V = inventory.checkAvailableVehicle(vehicle, desiredFeatures);
        if (V != null) {
            System.out.println("Vehicle with Registration Number "+V.getRegistrationNumber()+" has been reserved.");

        }
            else {
                System.out.println("No available vehicle matches your criteria.");
            }

        }

        }



