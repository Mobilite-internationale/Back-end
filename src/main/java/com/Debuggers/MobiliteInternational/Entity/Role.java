package com.Debuggers.MobiliteInternational.Entity;

import com.Debuggers.MobiliteInternational.Entity.Enum.ERole;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role  implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long roleId ;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(length = 20)
    private ERole nom;




}
