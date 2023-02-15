package com.Debuggers.MobiliteInternational.Entity;

import com.Debuggers.MobiliteInternational.Entity.Enum.StudyField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="offres")
@NoArgsConstructor
@AllArgsConstructor
public class Offer implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long offerId;

    private Date dateDebut;

    private Date dateFin;

    private String Title;

    private String description ;

    private Date deadline;

    @Enumerated(EnumType.STRING)
    @NotNull
    private StudyField fieldOfStudy;


    private String prerequis;

    private String image;

    private Double frais;


    private Boolean archive;
    @ManyToOne

    private University university;

    @ManyToOne
    private Candidacy candidacy;









}
