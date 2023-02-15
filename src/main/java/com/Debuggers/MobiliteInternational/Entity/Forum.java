package com.Debuggers.MobiliteInternational.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="Forums")
@NoArgsConstructor
@AllArgsConstructor
public class Forum  implements Serializable {
}
