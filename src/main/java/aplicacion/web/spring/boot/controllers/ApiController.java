package aplicacion.web.spring.boot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.web.spring.boot.model.Persona;

@RestController
@RequestMapping("/api/ejemplo")
public class ApiController {
 

/**
 * API DE SALUDO
 */
@PostMapping("/saludo")
public Persona Saludar(@RequestBody Persona persona){
 return persona;
}
}
