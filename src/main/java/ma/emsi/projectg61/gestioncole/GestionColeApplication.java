package ma.emsi.projectg61.gestioncole;

import ma.emsi.projectg61.gestioncole.entities.Etudiant;
import ma.emsi.projectg61.gestioncole.entities.Seance;
import ma.emsi.projectg61.gestioncole.repositories.EtudiantRepository;
import ma.emsi.projectg61.gestioncole.repositories.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class GestionColeApplication implements CommandLineRunner {

   @Autowired
   private EtudiantRepository etudiantRepository;
   @Autowired
   private SeanceRepository seanceRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionColeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Seance sc = new Seance(null,new Date("2024/03/21"),new Date(),new Date(),null);
        seanceRepository.save(sc);
        etudiantRepository.save(new Etudiant(null,"Ayman","SW334", Arrays.asList(sc)));
        etudiantRepository.save(new Etudiant(null,"Othman","DS324", Arrays.asList(sc)));


    }
}
