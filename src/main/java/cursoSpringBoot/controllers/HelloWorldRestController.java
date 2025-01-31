package cursoSpringBoot.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    //Ruta con la que se va a acceder al metodo para que nos de la respuesta.
    //Ruta haga referencia a lo que nos va a retornar el metodo.
    //Puede tener varias direcciones y funcionar, como:

    //@GetMapping({"/hello", "/hw", "/hola"})

    @GetMapping("/hello")
    public String helloWorld(){
        //Comprobar que solo se hace desde el lado del cliente, se imprime en pantalla
        // En este caso de ejecuta primero el print.
        System.out.println("Solicitud ejecutada!");
        //Lo que quiero que este metodo retorne cuando se haga una solicitud http
        //de tipo GET.
        return "Hello, World!";

        //Probar de manera local, localhost:/PUERTO/RUTA

    }
}
