package org.github.alex.hnyp.javersdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.javers.core.metamodel.annotation.Entity;
import org.javers.core.metamodel.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PersonEntity {

    @Id
    protected String id;

    protected Person value;

}
