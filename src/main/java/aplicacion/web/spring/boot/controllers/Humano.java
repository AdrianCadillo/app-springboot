package aplicacion.web.spring.boot.controllers;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import aplicacion.web.spring.boot.model.Persona;

@Controller
public class Humano {
   List<Persona> listaDePersonas = new ArrayList<>(Arrays.asList(
     new Persona(1, "Abelardo Adrian", "Rosales Cadillo",29,"Ing.de sistemas",true),
     new Persona(2, "Pedro Luis", "Morales Villanueva", null, "Administradora",false),
     new Persona(3, "Carla Yovana", "Broncano Urbano", 35, "Contabilidad",true)
   ));
    /*** MOSTRAR UNA VISTA DEL HUMANO */
    @GetMapping("/humano")
    public String index(Model model){
        model.addAttribute("humanos",listaDePersonas);
        return "humano/index";
    }

     

    @PostMapping("/enviar-formulario")
    public String EnvioForm(
      @RequestParam(name = "cliente") String Cliente,
      @RequestParam(name = "profesion") String Profesion,
      RedirectAttributes redirectAttributes
    ){

      ArrayList<String> Errors = new ArrayList<>();

      if(Cliente.isEmpty()){
        Errors.add("Ingrese nombre del cliente!!!");
      } 
      if(Profesion.isEmpty()){
        Errors.add("Ingrese Profesion del cliente!!!");
      } 

      if(Errors.isEmpty()){
        redirectAttributes.addFlashAttribute("cliente",Cliente);
        redirectAttributes.addFlashAttribute("profesion",Profesion);
      } else{
        redirectAttributes.addFlashAttribute("clienteold",Cliente);
        redirectAttributes.addFlashAttribute("profesionold",Profesion);
        redirectAttributes.addFlashAttribute("errors",Errors);
      }
      return   "redirect:/humano";
    }
 
}
