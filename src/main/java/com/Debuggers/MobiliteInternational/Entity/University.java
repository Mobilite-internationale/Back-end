package com.Debuggers.MobiliteInternational.Entity;


import com.Debuggers.MobiliteInternational.Entity.Enum.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="universite")
public class University implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private  Long universiteId;

    private String nameUniversite;

    private String location;

    private Float lattitude;

    private Float longitude;

    private String description;

    private Type type;

    private String image;

    @ManyToOne
    private User user;

    @OneToMany
    private Interview interview;


}
