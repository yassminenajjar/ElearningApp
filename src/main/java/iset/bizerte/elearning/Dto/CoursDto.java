package iset.bizerte.elearning.Dto;


import iset.bizerte.elearning.Entity.Cours;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CoursDto {


    private String titre;
    private Boolean estouverte;
    private Boolean deleted;
    private String urlimage;


    public static Cours ToEntity(CoursDto cours) {

        return Cours.builder()
                .titre(cours.getTitre())
                .estouverte(cours.getEstouverte())
                .urlimage(cours.getUrlimage())
                .deleted(cours.getDeleted())
                .build();




    }






    public static CoursDto FromEntity(Cours cours) {

        return CoursDto.builder()
                .titre(cours.getTitre())
                .estouverte(cours.getEstouverte())
                .urlimage(cours.getUrlimage())
                .deleted(cours.getDeleted())
                .build();




    }







}
