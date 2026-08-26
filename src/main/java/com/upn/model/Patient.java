package com.upn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data // Setters and getters
@NoArgsConstructor // Constructor sin parámetros
@AllArgsConstructor // Constructor con parámetros
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity // Este objeto tiene una reprensentacion de db --> tabla
public class Patient {
    @EqualsAndHashCode.Include
    @Id
    private Integer idPatient;
    private String firstName;
}
