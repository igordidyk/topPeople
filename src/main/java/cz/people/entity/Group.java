package cz.people.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameGroup;
    private int numberOfCanditates;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "group")
    private List<Employee> employees = new ArrayList<>();


}
