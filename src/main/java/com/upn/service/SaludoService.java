package com.upn.service;

import com.upn.model.Saludo;
import com.upn.repository.SaludoRepository;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {
  private final SaludoRepository saludoRepository;

  // Inyeccion de dependencias
  public SaludoService(SaludoRepository saludoRepository) {
    this.saludoRepository = saludoRepository;
  }

  public Saludo generarSaludo(String nombre){
    // Logica: Guardar el nombre en el repositorio
    saludoRepository.guardarNombre(nombre);

    // Retorna el objeto
    return new Saludo("Hola " +  nombre, "success");
  }
}
