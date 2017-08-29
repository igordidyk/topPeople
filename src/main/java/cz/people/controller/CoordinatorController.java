package cz.people.controller;

import cz.people.entity.Address;
import cz.people.entity.Employee;
import cz.people.service.CoordinatorService;
import cz.people.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/coordinator", method = RequestMethod.POST)
public class CoordinatorController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CoordinatorService coordinatorService;

    @GetMapping("/employee")
    public String addCoordinator(Model model,Principal principal) {
        model.addAttribute("key",principal.getName());
//        model.addAttribute("employees", employeeService.findEmployeesWithEducationAndLang());
        System.out.println(employeeService.findAll());
        return "employeePage";
    }

    @PostMapping("createEmployeer")
    public String save(@RequestParam("name") String name,
                       @RequestParam("surname") String surname,
                       @RequestParam("gender") String gender,
                       @RequestParam("nationality") String nationality,
                       @RequestParam("born") String born,
                       @RequestParam("birthPlace") String birthPlace,
                       @RequestParam("country") String country,
                       @RequestParam("region") String region,
                       @RequestParam("city") String city,
                       @RequestParam("postIndex") String postIndex,
                       @RequestParam("street") String street ,
                       @RequestParam("numberOfHouse") String numberOfHouse,
                       @RequestParam("passportNomer") String passportNomer,
                       @RequestParam("passportValidUntil") String passportValidUntil,
                       @RequestParam("issuedByAuthority") String issuedByAuthority,
                       @RequestParam("telephone") String telephone,
                       @RequestParam("email") String email,
                       @RequestParam("education") String education,
                       @RequestParam("language") String language,
                       @RequestParam("cz_isco") String cz_isco,
                       @RequestParam("position") String position,
                       @RequestParam("numberOfVacancy") String numberOfVacancy,
                       @RequestParam("phase") int phase,
                       @RequestParam("status") int status,
                       @RequestParam("receivedOrder") String receivedOrder,
                       @RequestParam("schengen") String schengen,
                       @RequestParam("workingAgreement") String workingAgreement,
                       @RequestParam("workingAgree") String workingAgree,
                       @RequestParam("confirmationOfLivingPlace") String confirmationOfLivingPlace,
                       @RequestParam("beginWorkingContract") String beginWorkingContract,
                       @RequestParam("endWorkingContract") String endWorkingContract,
                       @RequestParam("schengenTrialPeriod") String schengenTrialPeriod,
                       @RequestParam("realStartingOfSchengen") String realStartingOfSchengen,
                       @RequestParam("multiVisa") String multiVisa,
                       @RequestParam("ECBegin") String ECBegin,
                       @RequestParam("ECEnd") String ECEnd,
                       @RequestParam("ECTrialPeriod") String ECTrialPeriod,
                       @RequestParam("expectedStartingAtCompany") String expectedStartingAtCompany,
                       @RequestParam("duration") String duration,
                       @RequestParam("presentedToCompany") String presentedToCompany,
                       @RequestParam("ministryOfForeignAffairs") String ministryOfForeignAffairs,
                       @RequestParam("interviewAtConsulate") String interviewAtConsulate,
                       @RequestParam("pickingUpTheVISA") String pickingUpTheVISA,
                       @RequestParam("registrationAtLocalOffice") String registrationAtLocalOffice,
                       @RequestParam("startingToWork") String startingToWork,
                       @RequestParam("receivingEmploymentCard") String receivingEmploymentCard,
                       @RequestParam("comments") String comments,
                       @RequestParam("coordinator") String coordinator) {

        Employee employee = new Employee();

        Address address = new Address();
        address.setCountry(country);
        address.setRegion(region);
        address.setCity(city);
        address.setPostIndex(postIndex);
        address.setStreet(street);
        address.setNumberOfHouse(numberOfHouse);

        employee.setName(name);
        employee.setSurname(surname);
        employee.setGender(gender);
        employee.setNationality(nationality);
        employee.setBorn(born);
//        employee.setBirthPlace(birthPlace);

        employee.setAddress(address);

//        employee.setPassportNomer(passportNomer);
        employee.setPassportValidUntil(passportValidUntil);
        employee.setIssuedByAuthority(issuedByAuthority);
        employee.setTelephone(telephone);
        employee.setEmail(email);

//        List<String> educationList = new ArrayList<>();
//        educationList.add(education);
//        employee.setEducation(educationList);
//        List<String> languageList = new ArrayList<>();
//        languageList.add(language);
//        employee.setLanguage(languageList);

        employee.setCz_isco(cz_isco);
        employee.setPosition(position);
        employee.setNumberOfVacancy(numberOfVacancy);
        employee.setPhase(phase);
        employee.setStatus(status);
        employee.setReceivedOrder(receivedOrder);
        employee.setSchengen(schengen);
        employee.setWorkingAgreement(workingAgreement);
        employee.setWorkingAgree(workingAgree);
        employee.setConfirmationOfLivingPlace(confirmationOfLivingPlace);
        employee.setBeginWorkingContract(beginWorkingContract);
        employee.setEndWorkingContract(endWorkingContract);
        employee.setSchengenTrialPeriod(schengenTrialPeriod);
        employee.setRealStartingOfSchengen(realStartingOfSchengen);
        employee.setMultiVisa(multiVisa);
        employee.setECBegin(ECBegin);
        employee.setECEnd(ECEnd);
        employee.setECTrialPeriod(ECTrialPeriod);
        employee.setExpectedStartingAtCompany(expectedStartingAtCompany);
        employee.setDuration(duration);
        employee.setPresentedToCompany(presentedToCompany);
        employee.setMinistryOfForeignAffairs(ministryOfForeignAffairs);
        employee.setInterviewAtConsulate(interviewAtConsulate);
        employee.setPickingUpTheVISA(pickingUpTheVISA);
        employee.setRegistrationAtLocalOffice(registrationAtLocalOffice);
        employee.setStartingToWork(startingToWork);
        employee.setReceivingEmploymentCard(receivingEmploymentCard);
        employee.setComments(comments);
        employee.setCoordinator(coordinatorService.findByName(coordinator));
        employeeService.save(employee);
//        return "admin";
        return "redirect:/coordinator/employee";
    }

    @GetMapping("/employee/remove-{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeService.delete(id);
//        employeeService.findOne(id)
        return "redirect:/coordinator/employee";
    }

    @GetMapping("/employee/edit-{id}")
    public String editEmployee(@PathVariable("id") Integer id,Model model){
//        model.addAttribute("employee",employeeService.findOneEmployeeWithEducationAndLang(id));
        return "editEmployee";
    }

    @PostMapping("/employee/update")
        public String updateEmployee(@RequestParam("name") String name,
                                     @RequestParam("surname") String surname,
                                     @RequestParam("gender") String gender,
                                     @RequestParam("nationality") String nationality,
                                     @RequestParam("born") String born,
                                     @RequestParam("birthPlace") String birthPlace,
                                     @RequestParam("country") String country,
                                     @RequestParam("region") String region,
                                     @RequestParam("city") String city,
                                     @RequestParam("postIndex") String postIndex,
                                     @RequestParam("street") String street ,
                                     @RequestParam("numberOfHouse") String numberOfHouse,
                                     @RequestParam("passportNomer") String passportNomer,
                                     @RequestParam("passportValidUntil") String passportValidUntil,
                                     @RequestParam("issuedByAuthority") String issuedByAuthority,
                                     @RequestParam("telephone") String telephone,
                                     @RequestParam("email") String email,
                                     @RequestParam("education") String education,
                                     @RequestParam("language") String language,
                                     @RequestParam("cz_isco") String cz_isco,
                                     @RequestParam("position") String position,
                                     @RequestParam("numberOfVacancy") String numberOfVacancy,
                                     @RequestParam("phase") int phase,
                                     @RequestParam("status") int status,
                                     @RequestParam("receivedOrder") String receivedOrder,
                                     @RequestParam("schengen") String schengen,
                                     @RequestParam("workingAgreement") String workingAgreement,
                                     @RequestParam("workingAgree") String workingAgree,
                                     @RequestParam("confirmationOfLivingPlace") String confirmationOfLivingPlace,
                                     @RequestParam("beginWorkingContract") String beginWorkingContract,
                                     @RequestParam("endWorkingContract") String endWorkingContract,
                                     @RequestParam("schengenTrialPeriod") String schengenTrialPeriod,
                                     @RequestParam("realStartingOfSchengen") String realStartingOfSchengen,
                                     @RequestParam("multiVisa") String multiVisa,
                                     @RequestParam("ECBegin") String ECBegin,
                                     @RequestParam("ECEnd") String ECEnd,
                                     @RequestParam("ECTrialPeriod") String ECTrialPeriod,
                                     @RequestParam("expectedStartingAtCompany") String expectedStartingAtCompany,
                                     @RequestParam("duration") String duration,
                                     @RequestParam("presentedToCompany") String presentedToCompany,
                                     @RequestParam("ministryOfForeignAffairs") String ministryOfForeignAffairs,
                                     @RequestParam("interviewAtConsulate") String interviewAtConsulate,
                                     @RequestParam("pickingUpTheVISA") String pickingUpTheVISA,
                                     @RequestParam("registrationAtLocalOffice") String registrationAtLocalOffice,
                                     @RequestParam("startingToWork") String startingToWork,
                                     @RequestParam("receivingEmploymentCard") String receivingEmploymentCard,
                                     @RequestParam("comments") String comments,
                                     @RequestParam("employee") int idEmployee) {

        Employee employee = employeeService.findOne(idEmployee);

        Address address = new Address();
        address.setCountry(country);
        address.setRegion(region);
        address.setCity(city);
        address.setPostIndex(postIndex);
        address.setStreet(street);
        address.setNumberOfHouse(numberOfHouse);

        employee.setName(name);
        employee.setSurname(surname);
        employee.setGender(gender);
        employee.setNationality(nationality);
        employee.setBorn(born);
//        employee.setBirthPlace(birthPlace);

        employee.setAddress(address);

//        employee.setPassportNomer(passportNomer);
        employee.setPassportValidUntil(passportValidUntil);
        employee.setIssuedByAuthority(issuedByAuthority);
        employee.setTelephone(telephone);
        employee.setEmail(email);

//        List<String> educationList = new ArrayList<>();
//        educationList.add(education);
//        employee.setEducation(educationList);
//        List<String> languageList = new ArrayList<>();
//        languageList.add(language);
//        employee.setLanguage(languageList);

        employee.setCz_isco(cz_isco);
        employee.setPosition(position);
        employee.setNumberOfVacancy(numberOfVacancy);
        employee.setPhase(phase);
        employee.setStatus(status);
        employee.setReceivedOrder(receivedOrder);
        employee.setSchengen(schengen);
        employee.setWorkingAgreement(workingAgreement);
        employee.setWorkingAgree(workingAgree);
        employee.setConfirmationOfLivingPlace(confirmationOfLivingPlace);
        employee.setBeginWorkingContract(beginWorkingContract);
        employee.setEndWorkingContract(endWorkingContract);
        employee.setSchengenTrialPeriod(schengenTrialPeriod);
        employee.setRealStartingOfSchengen(realStartingOfSchengen);
        employee.setMultiVisa(multiVisa);
        employee.setECBegin(ECBegin);
        employee.setECEnd(ECEnd);
        employee.setECTrialPeriod(ECTrialPeriod);
        employee.setExpectedStartingAtCompany(expectedStartingAtCompany);
        employee.setDuration(duration);
        employee.setPresentedToCompany(presentedToCompany);
        employee.setMinistryOfForeignAffairs(ministryOfForeignAffairs);
        employee.setInterviewAtConsulate(interviewAtConsulate);
        employee.setPickingUpTheVISA(pickingUpTheVISA);
        employee.setRegistrationAtLocalOffice(registrationAtLocalOffice);
        employee.setStartingToWork(startingToWork);
        employee.setReceivingEmploymentCard(receivingEmploymentCard);
        employee.setComments(comments);
//        employee.setCoordinator(coordinatorService.findByName(coordinator));
        employeeService.save(employee);
//        return "admin";
            return "redirect:/coordinator/employee";
        }


}
