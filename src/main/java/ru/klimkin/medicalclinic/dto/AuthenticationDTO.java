package ru.klimkin.medicalclinic.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class AuthenticationDTO {

    @NotEmpty(message = "Name must be filled")
    @Size(min = 2, max = 100, message = " Length of name must be between 2 and 100 character")
    private String username;

    private String password;

}
