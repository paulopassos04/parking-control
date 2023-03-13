package br.com.api.models;

import br.com.api.models.enums.VehicleType;
import jakarta.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String licensePlateCar;
    private String model;
    private String color;
    private Integer vehicleType;

    public Vehicle(){}

    public Vehicle(UUID id, String licensePlateCar, String model, String color, VehicleType vehicleType) {
        this.id = id;
        this.licensePlateCar = licensePlateCar;
        this.model = model;
        this.color = color;
        setVehicleType(vehicleType);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicleType() {
        return VehicleType.valueOf(vehicleType);
    }

    public void setVehicleType(VehicleType vehicleType) {
        if(vehicleType != null){
            this.vehicleType = vehicleType.getCode();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
