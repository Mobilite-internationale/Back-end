package com.Debuggers.MobiliteInternational.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="dorms")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Dormitories implements Serializable {
}
