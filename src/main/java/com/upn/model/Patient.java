package com.upn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data // Setters and getters
@NoArgsConstructor // Constructor sin parámetros
@AllArgsConstructor // Constructor con parámetros
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Patient {
    @EqualsAndHashCode.Include
    private Integer idPatient;
    private String firstName;
}
