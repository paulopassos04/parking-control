package br.com.api.models;

import jakarta.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_vacancy")
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Integer number;
    @OneToOne
    @JoinColumn(name = "id.tb_apartment")
    private Apartment apartment;

    @OneToOne
    @JoinColumn(name = "id.tb_vehicle")
    private Vehicle vehicle;

    public Vacancy(){}

    public Vacancy(UUID id, Integer number, Apartment apartment, Vehicle vehicle) {
        this.id = id;
        this.number = number;
        this.apartment = apartment;
        this.vehicle = vehicle;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacancy vacancy = (Vacancy) o;
        return Objects.equals(id, vacancy.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
