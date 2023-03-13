package br.com.api.config;

import java.util.Arrays;
import br.com.api.models.Apartment;
import br.com.api.models.Vacancy;
import br.com.api.models.Vehicle;
import br.com.api.models.enums.VehicleType;
import br.com.api.repository.ApartmentRepository;
import br.com.api.repository.VacancyRepository;
import br.com.api.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void run(String... args) throws Exception {

        Apartment apartment1 = new Apartment(null, 10, "e1");
        Apartment apartment2 = new Apartment(null, 11, "e2");
        Apartment apartment3 = new Apartment(null, 12, "e3");

        apartmentRepository.saveAll(Arrays.asList(apartment1, apartment2, apartment3));

        Vehicle vehicle1 = new Vehicle(null, "qwse111", "teste1", "rosa", VehicleType.sedan);

        vehicleRepository.saveAll(Arrays.asList(vehicle1));

    }
}
