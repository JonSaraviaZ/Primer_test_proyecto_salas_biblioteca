package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.CarreraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/carreras")
public class CarreraController {
    private final CarreraService service;

    public CarreraController(CarreraService service) {
        this.service = service;
    }

    @GetMapping
    public List<Carrera> getAll() {
        return service.findAll();
    }
}
