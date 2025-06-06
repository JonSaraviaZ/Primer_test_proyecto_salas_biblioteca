package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String run;
    private String nombres;
    private String correo;
    private char jornada;
    private int telefono;

    @ManyToOne
    @JoinColumn(name = "carrera_id")
    private Carrera carrera;
}
