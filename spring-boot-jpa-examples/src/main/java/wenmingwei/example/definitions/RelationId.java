package wenmingwei.example.definitions;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class RelationId implements Serializable {

    private long people;
    private long group;
}
