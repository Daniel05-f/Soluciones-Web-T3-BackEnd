package com.upn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter y Setter
@AllArgsConstructor // Constructor con todos los atributos
@NoArgsConstructor
public class Saludo {
  private String mensaje;
  private String status;

    /*
    public Saludo(String mensaje, String status) {
        this.mensaje = mensaje;
        this.status = status;
    }
    */
}
