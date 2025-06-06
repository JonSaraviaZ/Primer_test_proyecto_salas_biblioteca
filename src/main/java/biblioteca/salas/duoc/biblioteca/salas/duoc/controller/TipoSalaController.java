package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.TipoSala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.TipoSalaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TipoSalaController {
    private final TipoSalaService service;

    public TipoSalaController(TipoSalaService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoSala> getAll() {
        return service.findAll();
    }   
}
