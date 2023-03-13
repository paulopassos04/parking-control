package br.com.api.models.enums;

public enum VehicleType {
    sedan(1),
    suvCar(2),
    pickupTruck(3),
    motorbike(4);

    private int code;

    private VehicleType(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static VehicleType valueOf(int code) {
        for (VehicleType value : VehicleType.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
