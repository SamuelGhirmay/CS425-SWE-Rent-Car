package edu.miu.cs425swerentcar.enums;

public enum VehicleFuelType {
    DIESEL("Diesel"),
    GASOLINE("Gasoline"),
    ELECTRIC("Electric");

    private final String fuelType;

    private VehicleFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}
