import java.util.*;

 public abstract class Vehicle {
    String registrationNumber;
    String fuelType; // Petrol, Diesel, Electric, Hybrid
    boolean isAvailable;
    Map<String, Object> features; // e.g., sunroof, cargo capacity, etc.

    Vehicle(String regNum,String fuel,boolean isAvailable, Map<String, Object> feats) {
        this.registrationNumber = regNum;
        this.fuelType = fuel;
        this.isAvailable = true;
        this.features = feats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Map<String,Object> getFeatures() {
        return features;
    }
     public abstract double calculatePrice();
     public abstract String getVehicleType();

 }


