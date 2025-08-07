import java.util.*;

public class VehicleInventory {
    // List to store all vehicles
    private List<Vehicle> inventory;

    public VehicleInventory() {
        inventory = new ArrayList<>();
        initializeVehicles();
    }
    // Initialize with some vehicles
    private void initializeVehicles() {
        Map<String, Object> carFeatures = new HashMap<>();
        carFeatures.put("sunroof", true);
        carFeatures.put("transmission", "Automatic");
        inventory.add(new Car("ABC123", "Petrol",true, carFeatures));

        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        inventory.add(new Truck("XYZ789","Diesel",true, truckFeatures));

        Map<String, Object> MotorcycleFeatures = new HashMap<>();
        MotorcycleFeatures.put("hp", 190);
        inventory.add(new Motorcycle("رق 345","Benzine",true, MotorcycleFeatures));


    }
    // Method to check availability
    public Vehicle checkAvailableVehicle(String Vehicle, Map<String, Object> desiredFeatures) {
            for (Vehicle v : inventory) {
                if (v.getVehicleType().equalsIgnoreCase(Vehicle)  && v.isAvailable) {
                    boolean matches = true;
                    for (String key : desiredFeatures.keySet()) {
                        if (!v.features.containsKey(key) || !v.features.get(key).equals(desiredFeatures.get(key))) {
                            matches = false;
                            break;
                        }
                    }
                    if (matches) {
                        v.isAvailable = false;
                        return v;
                    }
                }
            }
            return null; // No matching vehicle available
        }


        }


