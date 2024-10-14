package iset.bizerte.elearning.Dto;

import iset.bizerte.elearning.Entity.Seance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SeanceDto {


    private String titre;
    private String urlvideo;
    private Boolean deleted;

    public static Seance toEntity(SeanceDto seance) {


        return Seance.builder()
                .titre(seance.titre)
                .urlvideo(seance.urlvideo)
                .deleted(seance.deleted)


                .build();





    }


    public static SeanceDto FromEntity(Seance seance) {


        return SeanceDto.builder()
                .titre(seance.getTitre())
                .urlvideo(seance.getUrlvideo())
                .deleted(seance.getDeleted())


                .build();





    }















}
