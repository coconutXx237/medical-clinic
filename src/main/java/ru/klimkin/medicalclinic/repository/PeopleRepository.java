package ru.klimkin.medicalclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.klimkin.medicalclinic.entity.Person;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}
