package cursoSpringBoot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping("/saludo/{name}") //Puede tener más variables 
    public String greeting (@PathVariable String name){
        return "Hola " + name;
        //Creando un endpoint que recibe la solicitud get para retornar el saludo
        //personalizado
    }
}
