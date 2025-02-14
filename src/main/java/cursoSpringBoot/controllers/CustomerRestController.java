package cursoSpringBoot.controllers;

import cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerRestController {


    //Crear los recursos (Datos ficticios)-No está bien colocarla en nuestro controlador,
    //Solo es por términos prácticos.
    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(123, "Gerardo López", "gerardol", "contrasena123"),
            new Customer(456, "Alejandra García", "alejagarcia", "contrasena456"),
            new Customer(789, "Laura Sanchez", "lauras", "contrasena789"),
            new Customer(234, "Carlos Martínez", "carlosm", "contrasena234")
    ));

    //Crear el metodo que va a servir como endpoint el cual estara expuesto para recibir solicitudes http
    @GetMapping("/clientes")
    public List<Customer> getCustomers() {
        //Retorna la lista de clientes
        return customers;
    }

    @GetMapping("/clientes/{username}")
    public Customer getCliente(@PathVariable String username) {
        for (Customer c : customers) {
            if (c.getUsername().equalsIgnoreCase(username)) {
                return c;
            }
        }
        return null;
    }

    @PostMapping("/clientes")
    public Customer postCliente(@RequestBody Customer customer) {
        customers.add(customer);
        return customer;
    }

    @PutMapping
    public Customer putCliente(@RequestBody Customer customer) {
        for (Customer c : customers) {
            if (c.getID() == customer.getID()) {
                c.setUsername(customer.getUsername());
                c.setPassword(customer.getPassword());
                c.setName(customer.getName());

                return c;
            }

        }

        return customer;
    }

}













