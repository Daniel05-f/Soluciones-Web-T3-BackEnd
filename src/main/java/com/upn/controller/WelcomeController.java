package com.upn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

// http://localhost:8080 --> path
@RestController
@RequestMapping("/welcome") // http://localhost:8080/welcome
public class WelcomeController {
  @GetMapping("/saludo") // http://localhost:8080/welcome/saludo
  public String  obtenerSaludo (){
    return "¡Hola! Bienvenido a tu primera API REST con SpringBoot";
  }

  @GetMapping("/saludo-personalizado") // http://localhost:8080/api/saludo-personalizado?nombre=Gaby
  public String saludoPersonalizado(@RequestParam(value="nombre", defaultValue = "Genio") String nombre){
    return "¡Hola! Bienvenido " + nombre + ". Disfruta tu aprendizaje";
  }

  @GetMapping("/saludo-json")
  public Map<String, String> saludoJson(@RequestParam(value="nombre", defaultValue = "Genio") String nombre){
    Map<String, String> respuesta = new HashMap<>();
    respuesta.put("mensaje", "¡Hola! Bienvenido " + nombre);
    respuesta.put("status", "OK");
    return respuesta;
  }
}
