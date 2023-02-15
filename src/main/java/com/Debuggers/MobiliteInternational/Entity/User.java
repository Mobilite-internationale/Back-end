package com.Debuggers.MobiliteInternational.Entity;


import com.Debuggers.MobiliteInternational.Entity.Enum.Sexe;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="users" , uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "email"
        })
})
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long userId;


    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Date dateNaissance;

    @NotNull
    private String  phone;

    private String email;

    @Size(min = 6, message = "Length must be more than 6")
    private String password ;

    @NotNull
    private String adresse;

    @NotNull
    private Sexe sexe;

    private String image;


    private Boolean Alumni;


    @OneToOne
    private Role role;

    @OneToMany
    private Set<Post> posts;


    @OneToMany
    private Set<Comment> commentSet;



}
