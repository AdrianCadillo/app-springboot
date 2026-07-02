package aplicacion.web.spring.boot.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.web.spring.boot.model.Persona;

@RestController
public class PersonaController {
   
    List<Persona> listaPersonas = new ArrayList<>(Arrays.asList(
           // new Persona(1, "Abelardo Adrian", "Rosales Cadillo",29,"Ing.de sistemas"),
           // new Persona(2, "Pedro Luis", "Morales Villanueva", 25, "Administradora"),
           // new Persona(3, "Carla Yovana", "Broncano Urbano", 35, "Contabilidad")
        ));
    /** RUTA PARA MOSTRRA EL SALUDO DE LA PERSONA */
    @GetMapping("/saludo/{nombre}")
    public String Saludar(@PathVariable String nombre){
        return "Hola, "+nombre;
    }

    @GetMapping("/persona")
    public Map<String,Object> PersonaData(){

        Map<String,Object> mapa = new HashMap<>();

        mapa.put("personas",listaPersonas);
        return mapa;

    }

    @GetMapping("/persona/{id}")
    public ResponseEntity<Persona> PersonaDato(@PathVariable Integer id){

        for(Persona persona:this.listaPersonas){
            if(persona.getId() == id){
                return ResponseEntity.ok(persona);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/palindromo/{palabra}")
    public String Palindromo(@PathVariable String palabra){
        
      if(this.VerificarPalindromo(palabra)){
        return "si es palindromo!!";
      }
        
      return "no es palindromo1!";
     
    }

    private boolean VerificarPalindromo(String palabra){
        for(int i=0;i<palabra.length();i++){
            if(palabra.charAt(i) != palabra.charAt(palabra.length()-(i+1))){
                return false;
            }
        }

        return true;
    }
    
}
