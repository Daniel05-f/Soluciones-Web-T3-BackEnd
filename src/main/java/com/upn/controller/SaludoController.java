package com.upn.controller;

import com.upn.model.Saludo;
import com.upn.service.SaludoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {
  private final SaludoService saludoService;

  // Inyeccion de dependencias por constructor
  public SaludoController(SaludoService saludoService) {
    this.saludoService = saludoService;
  }

  @GetMapping("/saludo")
  public Saludo getSaludoService(@RequestParam(value="nombre", defaultValue = "Genio") String nombre) {
    return saludoService.generarSaludo(nombre);
  }
}
