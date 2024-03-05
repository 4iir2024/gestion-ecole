package ma.emsi.projectg61.gestioncole.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String matricule;

    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Seance> seance;


}
