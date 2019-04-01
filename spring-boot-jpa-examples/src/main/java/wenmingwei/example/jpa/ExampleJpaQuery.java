package wenmingwei.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wenmingwei.Example;
import wenmingwei.example.definitions.GroupRepository;
import wenmingwei.example.definitions.PeopleRepository;
import wenmingwei.example.definitions.RelationRepository;

@Component
public class ExampleJpaQuery implements Example {

    @Autowired
    private RelationRepository relationRepository;

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public void run() {
        System.out.println("Query all Relation: ");
        System.out.println("=====================================");
        relationRepository.findAll().forEach(p -> {
            System.out.println("Saved: " + p);
        });
        System.out.println("=====================================");
        System.out.println("Query all People: ");
        System.out.println("=====================================");
        peopleRepository.findAll().forEach(p -> {
            System.out.println("Saved: " + p);
        });
        System.out.println("=====================================");
        peopleRepository.findAll().forEach(p -> {
            System.out.println("Saved: " + p);
        });
        System.out.println("=====================================");
        relationRepository.findAll().forEach(p -> {
            System.out.println("Saved: " + p);
        });
        System.out.println("=====================================");
        groupRepository.findAll().forEach(p -> {
            System.out.println("Saved: " + p);
        });
        System.out.println("=====================================");
    }
}
