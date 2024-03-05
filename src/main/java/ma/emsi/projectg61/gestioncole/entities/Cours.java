package ma.emsi.projectg61.gestioncole.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Cours {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String description;

    @OneToOne
    private Professeur professeur;

}
