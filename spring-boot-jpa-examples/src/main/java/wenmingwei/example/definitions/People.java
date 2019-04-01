package wenmingwei.example.definitions;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "tb_people")
@Data
@ToString(exclude = "relation")
public class People {

    @Id
    private long id;

    @NotBlank(message = "Name should NOT be blank")
    @Column
    private String name;

    @Range(min = 1, max = 150, message = "Age should in range [1, 150]")
    @Column
    private int age;

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "people",
            cascade = CascadeType.REMOVE
    )
    private List<Relation> relation;
}
