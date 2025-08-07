import java.util.Map;

public class Car extends Vehicle {
    public Car(String registrationNumber, String fuelType,boolean isAvailable, Map<String, Object> features) {
        super(registrationNumber, fuelType,isAvailable, features);
    }

    @Override
    public double calculatePrice() {
        double basePrice = 50;
        if (Boolean.TRUE.equals(getFeatures().get("sunroof"))) {
            basePrice += 10;
        }
        return basePrice;
    }
    @Override
    public String getVehicleType() {
        return "Car";
    }

}
