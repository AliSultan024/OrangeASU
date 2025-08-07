import java.util.Map;

public class Motorcycle extends Vehicle {
    public Motorcycle(String registrationNumber, String fuelType,boolean isAvailable, Map<String, Object> features) {
        super(registrationNumber, fuelType,isAvailable, features);    }

    @Override
    public double calculatePrice() {
        return 30;
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}
