package biblioteca.salas.duoc.biblioteca.salas.duoc.service;


import java.util.List;

import org.springframework.stereotype.Service;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.TipoSala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.TipoSalaRepository;

@Service
public class TipoSalaService {

    private final TipoSalaRepository repo;

    public TipoSalaService(TipoSalaRepository repo) {
        this.repo = repo;
    }

    public List<TipoSala> findAll() {
        return repo.findAll();
    }
}
