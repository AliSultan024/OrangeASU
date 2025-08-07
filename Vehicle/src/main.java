import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class main{

    public static void main(String[] args) {
        VehicleOrderSystem system = new VehicleOrderSystem();

        // Example order for a Car with sunroof and automatic transmission
        Map<String, Object> Carfeatures = new HashMap<>();
        Carfeatures.put("sunroof", true);
        Carfeatures.put("transmission", "Automatic");
        system.placeOrder("Car", Carfeatures);

        // Example order for a Truck with cargo capacity 1500
        Map<String, Object> truckFeatures = new HashMap<>();
        truckFeatures.put("cargoCapacity", 1500);
        system.placeOrder("Truck", truckFeatures);


        //Example to reserve a motorcycle with horsepower 190
        Map<String, Object> MotorcycleFeatures = new HashMap<>();
        MotorcycleFeatures.put("hp",190);
        system.reserveVehicle("motorcycle", MotorcycleFeatures);


    }
}