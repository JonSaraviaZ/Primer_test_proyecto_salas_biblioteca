package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.CarreraRepository;

@Service
public class CarreraService {
    private final CarreraRepository repo;

    public CarreraService(CarreraRepository repo) {
        this.repo = repo;
    }

    public List<Carrera> findAll() {
        return repo.findAll();
    }
}