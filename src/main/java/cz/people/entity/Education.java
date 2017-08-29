package cz.people.entity;


import javax.persistence.*;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String standardEduction;
    private String year;
    private String nameOfSchool;
    private String profesion;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Employee employee;



//    standard eduction
}
