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
    private List<GroupWithEmployees> groups = new ArrayList<>();

    public Project() {
    }

    public Project(String numberOfVacancy, int status, String beginWorkingContract, String endWorkingContract, String schengenTrialPeriod, String realStartingOfSchengen, String multiVisa, String ECBegin, String ECEnd, String ECTrialPeriod, String presentedToCompany, String ministryOfForeignAffairs, String interviewAtConsulate, String pickingUpTheVISA, String registrationAtLocalOffice, String startingToWork, String receivingEmploymentCard, String comments) {
        this.numberOfVacancy = numberOfVacancy;
        this.status = status;
        this.beginWorkingContract = beginWorkingContract;
        this.endWorkingContract = endWorkingContract;
        this.schengenTrialPeriod = schengenTrialPeriod;
        this.realStartingOfSchengen = realStartingOfSchengen;
        this.multiVisa = multiVisa;
        this.ECBegin = ECBegin;
        this.ECEnd = ECEnd;
        this.ECTrialPeriod = ECTrialPeriod;
        this.presentedToCompany = presentedToCompany;
        this.ministryOfForeignAffairs = ministryOfForeignAffairs;
        this.interviewAtConsulate = interviewAtConsulate;
        this.pickingUpTheVISA = pickingUpTheVISA;
        this.registrationAtLocalOffice = registrationAtLocalOffice;
        this.startingToWork = startingToWork;
        this.receivingEmploymentCard = receivingEmploymentCard;
        this.comments = comments;
    }

    public Project(String numberOfVacancy, int status, String beginWorkingContract, String endWorkingContract, String schengenTrialPeriod, String realStartingOfSchengen, String multiVisa, String ECBegin, String ECEnd, String ECTrialPeriod, String presentedToCompany, String ministryOfForeignAffairs, String interviewAtConsulate, String pickingUpTheVISA, String registrationAtLocalOffice, String startingToWork, String receivingEmploymentCard, String comments, Company company, List<GroupWithEmployees> groups) {
        this.numberOfVacancy = numberOfVacancy;
        this.status = status;
        this.beginWorkingContract = beginWorkingContract;
        this.endWorkingContract = endWorkingContract;
        this.schengenTrialPeriod = schengenTrialPeriod;
        this.realStartingOfSchengen = realStartingOfSchengen;
        this.multiVisa = multiVisa;
        this.ECBegin = ECBegin;
        this.ECEnd = ECEnd;
        this.ECTrialPeriod = ECTrialPeriod;
        this.presentedToCompany = presentedToCompany;
        this.ministryOfForeignAffairs = ministryOfForeignAffairs;
        this.interviewAtConsulate = interviewAtConsulate;
        this.pickingUpTheVISA = pickingUpTheVISA;
        this.registrationAtLocalOffice = registrationAtLocalOffice;
        this.startingToWork = startingToWork;
        this.receivingEmploymentCard = receivingEmploymentCard;
        this.comments = comments;
        this.company = company;
        this.groups = groups;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfVacancy() {
        return numberOfVacancy;
    }

    public void setNumberOfVacancy(String numberOfVacancy) {
        this.numberOfVacancy = numberOfVacancy;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<GroupWithEmployees> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupWithEmployees> groups) {
        this.groups = groups;
    }


    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", numberOfVacancy='" + numberOfVacancy + '\'' +
                ", status=" + status +
                ", beginWorkingContract='" + beginWorkingContract + '\'' +
                ", endWorkingContract='" + endWorkingContract + '\'' +
                ", schengenTrialPeriod='" + schengenTrialPeriod + '\'' +
                ", realStartingOfSchengen='" + realStartingOfSchengen + '\'' +
                ", multiVisa='" + multiVisa + '\'' +
                ", ECBegin='" + ECBegin + '\'' +
                ", ECEnd='" + ECEnd + '\'' +
                ", ECTrialPeriod='" + ECTrialPeriod + '\'' +
                ", presentedToCompany='" + presentedToCompany + '\'' +
                ", ministryOfForeignAffairs='" + ministryOfForeignAffairs + '\'' +
                ", interviewAtConsulate='" + interviewAtConsulate + '\'' +
                ", pickingUpTheVISA='" + pickingUpTheVISA + '\'' +
                ", registrationAtLocalOffice='" + registrationAtLocalOffice + '\'' +
                ", startingToWork='" + startingToWork + '\'' +
                ", receivingEmploymentCard='" + receivingEmploymentCard + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
