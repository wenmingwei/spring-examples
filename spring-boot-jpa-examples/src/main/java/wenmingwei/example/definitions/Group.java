package wenmingwei.example.definitions;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "tb_group")
@Data
@ToString(exclude = "relation")
public class Group {

    @Id
    private long id;

    @NotNull(message = "Should not be null")
    @Size(min = 1, max = 20, message = "Length is not properly")
    @Column
    private String name;

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "group",
            cascade = CascadeType.REMOVE
    )
    private List<Relation> relation;
}
