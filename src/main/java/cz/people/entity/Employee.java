package cz.people.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String gender;
    private String nationality;
    private String born;

    private String passportNumber;
    private String passportValidUntil;
    private String issuedByAuthority;
    private String telephone;
    private String email;

    //    private String cz_isco;
//    private String position;
    private String numberOfVacancy;
    private int phase;
    private int status;
    private String receivedOrder;
    private String schengen;
    private String workingAgreement;
    private String workingAgree;
    private String confirmationOfLivingPlace;
    private String beginWorkingContract;
    private String endWorkingContract;
    private String schengenTrialPeriod;
    private String realStartingOfSchengen;
    private String multiVisa;
    private String ECBegin;
    private String ECEnd;
    private String ECTrialPeriod;
    private String expectedStartingAtCompany;
    private String duration;
    private String presentedToCompany;
    private String ministryOfForeignAffairs;
    private String interviewAtConsulate;
    private String pickingUpTheVISA;
    private String registrationAtLocalOffice;
    private String startingToWork;
    private String receivingEmploymentCard;
    private String comments;

    private String marriedStatus;
    private String currentOccupation;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address address;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private BirthPlace birthPlace;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private CZ_ISCO cz_isco;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Coordinator coordinator;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Project project;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private GroupWithEmployees groupWithEmployees;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee")
    private List<Education> educations = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "employee")
    private List<Language> languages = new ArrayList<>();


    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportValidUntil() {
        return passportValidUntil;
    }

    public void setPassportValidUntil(String passportValidUntil) {
        this.passportValidUntil = passportValidUntil;
    }

    public String getIssuedByAuthority() {
        return issuedByAuthority;
    }

    public void setIssuedByAuthority(String issuedByAuthority) {
        this.issuedByAuthority = issuedByAuthority;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberOfVacancy() {
        return numberOfVacancy;
    }

    public void setNumberOfVacancy(String numberOfVacancy) {
        this.numberOfVacancy = numberOfVacancy;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReceivedOrder() {
        return receivedOrder;
    }

    public void setReceivedOrder(String receivedOrder) {
        this.receivedOrder = receivedOrder;
    }

    public String getSchengen() {
        return schengen;
    }

    public void setSchengen(String schengen) {
        this.schengen = schengen;
    }

    public String getWorkingAgreement() {
        return workingAgreement;
    }

    public void setWorkingAgreement(String workingAgreement) {
        this.workingAgreement = workingAgreement;
    }

    public String getWorkingAgree() {
        return workingAgree;
    }

    public void setWorkingAgree(String workingAgree) {
        this.workingAgree = workingAgree;
    }

    public String getConfirmationOfLivingPlace() {
        return confirmationOfLivingPlace;
    }

    public void setConfirmationOfLivingPlace(String confirmationOfLivingPlace) {
        this.confirmationOfLivingPlace = confirmationOfLivingPlace;
    }

    public String getBeginWorkingContract() {
        return beginWorkingContract;
    }

    public void setBeginWorkingContract(String beginWorkingContract) {
        this.beginWorkingContract = beginWorkingContract;
    }

    public String getEndWorkingContract() {
        return endWorkingContract;
    }

    public void setEndWorkingContract(String endWorkingContract) {
        this.endWorkingContract = endWorkingContract;
    }

    public String getSchengenTrialPeriod() {
        return schengenTrialPeriod;
    }

    public void setSchengenTrialPeriod(String schengenTrialPeriod) {
        this.schengenTrialPeriod = schengenTrialPeriod;
    }

    public String getRealStartingOfSchengen() {
        return realStartingOfSchengen;
    }

    public void setRealStartingOfSchengen(String realStartingOfSchengen) {
        this.realStartingOfSchengen = realStartingOfSchengen;
    }

    public String getMultiVisa() {
        return multiVisa;
    }

    public void setMultiVisa(String multiVisa) {
        this.multiVisa = multiVisa;
    }

    public String getECBegin() {
        return ECBegin;
    }

    public void setECBegin(String ECBegin) {
        this.ECBegin = ECBegin;
    }

    public String getECEnd() {
        return ECEnd;
    }

    public void setECEnd(String ECEnd) {
        this.ECEnd = ECEnd;
    }

    public String getECTrialPeriod() {
        return ECTrialPeriod;
    }

    public void setECTrialPeriod(String ECTrialPeriod) {
        this.ECTrialPeriod = ECTrialPeriod;
    }

    public String getExpectedStartingAtCompany() {
        return expectedStartingAtCompany;
    }

    public void setExpectedStartingAtCompany(String expectedStartingAtCompany) {
        this.expectedStartingAtCompany = expectedStartingAtCompany;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPresentedToCompany() {
        return presentedToCompany;
    }

    public void setPresentedToCompany(String presentedToCompany) {
        this.presentedToCompany = presentedToCompany;
    }

    public String getMinistryOfForeignAffairs() {
        return ministryOfForeignAffairs;
    }

    public void setMinistryOfForeignAffairs(String ministryOfForeignAffairs) {
        this.ministryOfForeignAffairs = ministryOfForeignAffairs;
    }

    public String getInterviewAtConsulate() {
        return interviewAtConsulate;
    }

    public void setInterviewAtConsulate(String interviewAtConsulate) {
        this.interviewAtConsulate = interviewAtConsulate;
    }

    public String getPickingUpTheVISA() {
        return pickingUpTheVISA;
    }

    public void setPickingUpTheVISA(String pickingUpTheVISA) {
        this.pickingUpTheVISA = pickingUpTheVISA;
    }

    public String getRegistrationAtLocalOffice() {
        return registrationAtLocalOffice;
    }

    public void setRegistrationAtLocalOffice(String registrationAtLocalOffice) {
        this.registrationAtLocalOffice = registrationAtLocalOffice;
    }

    public String getStartingToWork() {
        return startingToWork;
    }

    public void setStartingToWork(String startingToWork) {
        this.startingToWork = startingToWork;
    }

    public String getReceivingEmploymentCard() {
        return receivingEmploymentCard;
    }

    public void setReceivingEmploymentCard(String receivingEmploymentCard) {
        this.receivingEmploymentCard = receivingEmploymentCard;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public String getCurrentOccupation() {
        return currentOccupation;
    }

    public void setCurrentOccupation(String currentOccupation) {
        this.currentOccupation = currentOccupation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BirthPlace getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(BirthPlace birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

//    public Project getProject() {
//        return project;
//    }
//
//    public void setProject(Project project) {
//        this.project = project;
//    }

    public GroupWithEmployees getGroupWithEmployees() {
        return groupWithEmployees;
    }

    public void setGroupWithEmployees(GroupWithEmployees groupWithEmployees) {
        this.groupWithEmployees = groupWithEmployees;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }


}
