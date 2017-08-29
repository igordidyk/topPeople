package cz.people.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameCompany;
    private String IC;
    private String contactAddress;
    private String telephone;
    private String email;
    private String KKOV;
    private String CZ_NACE;
    private String direstor;
    private String HRManager;
    private String contactPerson;



//    private int numberOfCanditates;

    @OneToMany( cascade =  CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")
    private List<Project> projects = new ArrayList<>();

    public Company() {
    }


    public Company(String nameCompany, String IC, String contactAddress, String telephone, String email, String KKOV, String CZ_NACE, String direstor, String HRManager, String contactPerson) {
        this.nameCompany = nameCompany;
        this.IC = IC;
        this.contactAddress = contactAddress;
        this.telephone = telephone;
        this.email = email;
        this.KKOV = KKOV;
        this.CZ_NACE = CZ_NACE;
        this.direstor = direstor;
        this.HRManager = HRManager;
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", nameCompany='" + nameCompany + '\'' +
                ", IC='" + IC + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", KKOV='" + KKOV + '\'' +
                ", CZ_NACE='" + CZ_NACE + '\'' +
                ", direstor='" + direstor + '\'' +
                ", HRManager='" + HRManager + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                '}';
    }
}
