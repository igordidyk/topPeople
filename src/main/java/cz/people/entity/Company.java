package cz.people.entity;

import javax.persistence.*;
import java.io.Serializable;
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
    private String CZ_NACE;
    private String email;
    //    private String HRManager;
//    private String KKOV;

//    private String contactPerson;
//    private String direstor;


//    private int numberOfCanditates;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "company")
    private List<ContactPerson> persons = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "company")
    private List<Project> projects = new ArrayList<>();

    public Company() {
    }

    public Company(String nameCompany, String IC, String contactAddress, String telephone, String CZ_NACE, String email) {
        this.nameCompany = nameCompany;
        this.IC = IC;
        this.contactAddress = contactAddress;
        this.telephone = telephone;
        this.CZ_NACE = CZ_NACE;
        this.email = email;
    }

    public Company(String nameCompany, String IC, String contactAddress, String telephone, String CZ_NACE, String email, List<ContactPerson> persons, List<Project> projects) {
        this.nameCompany = nameCompany;
        this.IC = IC;
        this.contactAddress = contactAddress;
        this.telephone = telephone;
        this.CZ_NACE = CZ_NACE;
        this.email = email;
        this.persons = persons;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCZ_NACE() {
        return CZ_NACE;
    }

    public void setCZ_NACE(String CZ_NACE) {
        this.CZ_NACE = CZ_NACE;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ContactPerson> getPersons() {
        return persons;
    }

    public void setPersons(List<ContactPerson> persons) {
        this.persons = persons;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", nameCompany='" + nameCompany + '\'' +
                ", IC='" + IC + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", CZ_NACE='" + CZ_NACE + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
