package iset.bizerte.elearning.Repository;

import iset.bizerte.elearning.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long > {
}
