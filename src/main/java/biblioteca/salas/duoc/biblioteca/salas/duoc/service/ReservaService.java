package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

import java.util.List;

import org.springframework.stereotype.Service;
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Reserva;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.ReservaRepository;

@Service
public class ReservaService {
    private final ReservaRepository repo;
    
    public ReservaService(ReservaRepository repo) {
        this.repo = repo;
    }

    public List<Reserva> findAll() {
        return repo.findAll();
    }
}
