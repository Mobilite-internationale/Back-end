package com.Debuggers.MobiliteInternational.Entity;

import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="comments")
public class Comment implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long commentId;

    private Integer likes;

    private Integer dislikes;

    private Date date;


    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;
}
