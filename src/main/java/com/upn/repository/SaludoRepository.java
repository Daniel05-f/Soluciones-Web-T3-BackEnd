package com.upn.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SaludoRepository {
  // Lista en memoria para simular  base de datos
  private final List<String> nombresRegistrados = new ArrayList<>();

  public void guardarNombre(String nombre){
    if(!nombresRegistrados.contains(nombre)){
      nombresRegistrados.add(nombre);
    }
  }

  public List<String> obtenerNombresRegistrados(){
    return nombresRegistrados;
  }

  public String obtenerSaludo(String nombre){
    return "Hola este es un saludo";
  }
}
