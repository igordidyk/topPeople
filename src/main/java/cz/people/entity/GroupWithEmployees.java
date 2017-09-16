package cz.people.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GroupWithEmployees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameGroup;
    private int numberOfCanditates;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "groupWithEmployees")
    private List<Employee> employees = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Project project;

    public GroupWithEmployees() {
    }

    public GroupWithEmployees(String nameGroup, int numberOfCanditates) {
        this.nameGroup = nameGroup;
        this.numberOfCanditates = numberOfCanditates;
    }

    public GroupWithEmployees(String nameGroup, int numberOfCanditates, List<Employee> employees) {
        this.nameGroup = nameGroup;
        this.numberOfCanditates = numberOfCanditates;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getNumberOfCanditates() {
        return numberOfCanditates;
    }

    public void setNumberOfCanditates(int numberOfCanditates) {
        this.numberOfCanditates = numberOfCanditates;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "GroupWithEmployees{" +
                "id=" + id +
                ", nameGroup='" + nameGroup + '\'' +
                ", numberOfCanditates=" + numberOfCanditates +
                '}';
    }
}
