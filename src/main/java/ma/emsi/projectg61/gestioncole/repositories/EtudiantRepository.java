package ma.emsi.projectg61.gestioncole.repositories;

import jakarta.transaction.Transactional;
import ma.emsi.projectg61.gestioncole.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
