package ru.klimkin.medicalclinic.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.klimkin.medicalclinic.entity.Person;
import ru.klimkin.medicalclinic.repository.PeopleRepository;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final PeopleRepository peopleRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void register(Person person) {
       person.setPassword(passwordEncoder.encode(person.getPassword()));
       person.setRole("ROLE_USER");
       peopleRepository.save(person);
    }
}
