package com.upn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpecialtyDTO {
    private Integer idSpecialty;
    private String name;
    private String description;
}
