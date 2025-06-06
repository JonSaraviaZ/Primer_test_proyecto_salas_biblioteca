package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Estudiante;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.EstudianteRepository;

@Service
public class EstudianteService {
    private final EstudianteRepository repo;
    
    public EstudianteService(EstudianteRepository repo) {
        this.repo = repo;
    }

    public List<Estudiante> findAll() {
        return repo.findAll();
    }
}
