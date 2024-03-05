package ma.emsi.projectg61.gestioncole.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Seance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date h_debut;
    @Temporal(TemporalType.TIME)
    private Date h_fin;

    @ManyToOne private Cours cours;
}
