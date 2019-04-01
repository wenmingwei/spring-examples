package wenmingwei.example.definitions;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tb_relation")
@IdClass(RelationId.class)
@Data
@ToString(exclude = {"group", "people"})
public class Relation {

    @Id
    @ManyToOne
    private People people;

    @Id
    @ManyToOne
    private Group group;

    @Column
    private int status;
}
