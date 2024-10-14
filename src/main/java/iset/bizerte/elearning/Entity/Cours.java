package iset.bizerte.elearning.Entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Cours extends AbstractEntity {
    private String titre;
    private Boolean estouverte;
    private Boolean deleted;
    private String urlimage;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cours", cascade = CascadeType.ALL)
    private Set<Tag_> tags = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matere_id")
    private Matiere matieres;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cours", cascade = CascadeType.ALL)
    private Set<Section> sections = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Enseignant teacher;






}



