package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitada;

    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSolicitada;

    @Temporal(TemporalType.TIMESTAMP)
    private Date horaCierre;

    private int estado;
}
