package cz.people.entity;

import javax.persistence.*;

@Entity
public class ContactPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String telephone;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Company company;


    public ContactPerson() {
    }

    public ContactPerson(String firstName, String lastName, String position, String email, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
    }

    public ContactPerson(String firstName, String lastName, String position, String email, String telephone, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
