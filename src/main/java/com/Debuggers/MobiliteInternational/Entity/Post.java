package com.Debuggers.MobiliteInternational.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Table(name="posts")
public class Post implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Long publicationId;

    private String title;

    private String description ;

    private Integer like;

    private Integer dislikes;

    private Date date;

    private Boolean archive;


    @ManyToOne
    private User user;


    @OneToMany
    private Set<Comment> commentSet;


}
