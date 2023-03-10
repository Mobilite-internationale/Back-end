package com.Debuggers.MobiliteInternational.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="entretiens")
@NoArgsConstructor
@AllArgsConstructor
public class Interview implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long interviewId;

    private Date calendar;

    private Boolean archive;
    @ManyToOne
    private Candidacy candidacy;

    @ManyToOne

    private University university;
}
