package cz.people.entity;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String country;
    private String region;
    private String city;
    private String postIndex;
    private String street;
    private String numberOfHouse;


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "address")
    private Employee employee;

    public Address() {
    }

    public Address(String country, String region, String city, String postIndex, String street, String numberOfHouse) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.postIndex = postIndex;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public Address(String country, String region, String city, String postIndex, String street, String numberOfHouse, Employee employee) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.postIndex = postIndex;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(String numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", postIndex='" + postIndex + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse='" + numberOfHouse + '\'' +
                '}';
    }
}
