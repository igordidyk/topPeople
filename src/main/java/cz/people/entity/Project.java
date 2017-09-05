package cz.people.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    private String numberOfVacancy;
    private int status;

    private String beginWorkingContract;
    private String endWorkingContract;
    private String schengenTrialPeriod;
    private String realStartingOfSchengen;
    private String multiVisa;
    private String ECBegin;
    private String ECEnd;
    private String ECTrialPeriod;


    private String presentedToCompany;
    private String ministryOfForeignAffairs;
    private String interviewAtConsulate;
    private String pickingUpTheVISA;
    private String registrationAtLocalOffice;
    private String startingToWork;
    private String receivingEmploymentCard;
    private String comments;





    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Company company;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "project")
    private List<Employee> employees = new ArrayList<>();


}
