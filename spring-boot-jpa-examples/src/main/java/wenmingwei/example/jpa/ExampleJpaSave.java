package wenmingwei.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wenmingwei.Example;
import wenmingwei.example.definitions.*;

@Component
public class ExampleJpaSave implements Example {

    @Autowired
    private RelationRepository relationRepository;

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void run() {

        People people = new People();
        people.setId(1);
        people.setName("wenmingwei");
        people.setAge(33);
        peopleRepository.save(people);

        Group group = new Group();
        group.setId(2);
        group.setName("eyecool");
        groupRepository.save(group);

        Relation relation = new Relation();
        relation.setPeople(people);
        relation.setGroup(group);
        relation.setStatus(10);
        Relation saved = relationRepository.save(relation);

        System.out.println("Saved: " + saved);
    }
}
