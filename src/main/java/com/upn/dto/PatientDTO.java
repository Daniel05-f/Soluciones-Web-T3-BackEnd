package com.upn.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientDTO {

    private Integer idPatient;

    @NotNull
    //@NotBlank
    //@NotEmpty
    @Size(min = 3, max = 70, message = "{firstname.size}")
    private String firstName;

    @NotNull
    @Size(min = 3, max = 70, message = "{lastname.size}")
    private String lastName;

    @NotNull
    private String dni;


    private String address;

    @NotNull
    @Pattern(regexp = "\\d{9}", message = "{phone.regex}")
    private String phone;

    @NotNull
    @Email(message = "{email.valid}")
    private String email;

    /*@Max(120)
    @Min(0)
    private int age = 0;*/

}
