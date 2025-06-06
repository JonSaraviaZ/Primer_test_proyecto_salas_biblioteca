package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Sala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.SalaRepository;

@Service
public class SalaService {
    private final SalaRepository repo;

    public SalaService(SalaRepository repo) {
        this.repo = repo;
    }

    public List<Sala> findAll() {
        return repo.findAll();
    }
}
