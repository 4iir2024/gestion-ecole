package ma.emsi.projectg61.gestioncole.repositories;

import jakarta.transaction.Transactional;
import ma.emsi.projectg61.gestioncole.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface SeanceRepository extends JpaRepository<Seance,Integer> {
}
