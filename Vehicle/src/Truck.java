import java.util.Map;

public class Truck extends Vehicle {
    public Truck(String registrationNumber, String fuelType,boolean isAvailable, Map<String, Object> features) {
        super(registrationNumber,fuelType,isAvailable, features);    }

    @Override
    public double calculatePrice() {
        double basePrice = 80;
        if (getFeatures().containsKey("cargoCapacity")) {
            basePrice += ((int) getFeatures().get("cargoCapacity")) * 0.05;
        }
        return basePrice;
    }
    @Override
    public String getVehicleType() {
        return "Truck";
    }

}