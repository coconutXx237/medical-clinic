package ru.klimkin.medicalclinic.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "person")
@Data
@NoArgsConstructor
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotEmpty(message = "Name must be filled")
    @Size(min = 2, max = 100, message = " Length of name must be between 2 and 100 character")
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;


/*    @Column(name = "speciality")
        @Enumerated(
    private PersonSpeciality personSpeciality;*/


    public Person(String username) {
        this.username = username;
    }

    // todo: add proper @Override toString() ? но надо ли

}
