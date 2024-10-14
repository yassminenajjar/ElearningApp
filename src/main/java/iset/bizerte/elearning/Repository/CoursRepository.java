package iset.bizerte.elearning.Repository;

import iset.bizerte.elearning.Entity.Cours;
import iset.bizerte.elearning.Entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long> {




    @Query("SELECT m FROM Cours m WHERE m.titre LIKE %?1%")
    List<Cours> searchByObjetStartsWith(String kye);



}
