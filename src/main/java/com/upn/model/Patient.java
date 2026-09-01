package com.upn.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data // Setters and getters
@NoArgsConstructor // Constructor sin parámetros
@AllArgsConstructor // Constructor con parámetros
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity // Este objeto tiene una representacion de db --> tabla
// @Table(name="pacientes", schema = "humanresources")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPatient; // PascalCase -> SnakeCase: idPatient --> id_patient

    @Column(nullable = false, length = 70)//, name = "primer_nombre")
    private String firstName;

    @Column(nullable = false, length = 70)
    private String lastName;

    @Column(nullable = false, length = 8)
    private String dni; // DNI / CE

    @Column(nullable = false, length = 255)
    private String address;

    @Column(nullable = false, length = 9)
    private String phone;

    @Column(nullable = false, length = 100)
    private String email;
}
