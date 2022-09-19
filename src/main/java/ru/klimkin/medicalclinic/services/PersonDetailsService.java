package ru.klimkin.medicalclinic.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.klimkin.medicalclinic.entity.Person;
import ru.klimkin.medicalclinic.repository.PeopleRepository;
import ru.klimkin.medicalclinic.security.PersonDetails;

@Service
@RequiredArgsConstructor
public class PersonDetailsService implements UserDetailsService {

    private final PeopleRepository peopleRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        Person user = peopleRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new PersonDetails(user);
    }
}
