package br.com.api.repository;

import br.com.api.models.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface VacancyRepository extends JpaRepository<Vacancy, UUID> {
}
