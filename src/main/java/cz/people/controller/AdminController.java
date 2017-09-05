package cz.people.controller;

import cz.people.entity.Company;
import cz.people.entity.ContactPerson;
import cz.people.entity.Coordinator;
import cz.people.service.CompanyService;
import cz.people.service.CoordinatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/admin", method = RequestMethod.POST)
public class AdminController {
    @Autowired
    private CoordinatorService service;
    @Autowired
    private CompanyService companyService;


    @GetMapping("/coordinators")
    public String coordinators(Model model) {
        model.addAttribute("coordinators", service.findAll());
        return "coordinatorsPage";
    }

    @GetMapping("/coordinators/remove-{id}")
    public String delete(@PathVariable("id") Integer id) {
        Coordinator coordinator = service.findOne(id);
        service.delete(coordinator);
        return "redirect:/admin/coordinators";
    }


    @PostMapping("/coordinators/createCoordinator")
    public String save(@RequestParam("firstName") String firstName,
                       @RequestParam("lastName") String lastName,
                       @RequestParam("email") String email,
                       @RequestParam("telephone") String telephone,
                       @RequestParam("username") String username,
                       @RequestParam("password") String password) {

        Coordinator coordinator = new Coordinator();
        coordinator.setFirstName(firstName);
        coordinator.setLastName(lastName);
        coordinator.setEmail(email);
        coordinator.setTelephone(telephone);
        coordinator.setUsername(username);
        coordinator.setPassword(password);
        service.save(coordinator);
        return "redirect:/admin/coordinators";
    }

    @GetMapping("/company")
    public String company(Model model) {
        model.addAttribute("companies", companyService.findAll());
        return "companyPage";
    }

    @PostMapping("/addCompany")
    public String addCompany(@RequestParam("nameCompany") String nameCompany,
                             @RequestParam("IC") String IC,
                             @RequestParam("contactAddress") String contactAddress,
                             @RequestParam("telephone") String telephone,
                             @RequestParam("CZ_NACE") String CZ_NACE,
                             @RequestParam("email") String email) {

        Company company = new Company(nameCompany, IC, contactAddress, telephone, CZ_NACE, email);
        companyService.save(company);


        return "redirect:/admin/company";
    }

    @GetMapping("/company/remove-{id}")
    public String deleteCompany(@PathVariable("id") Integer id) {
        Company company = companyService.findOne(id);
        companyService.delete(company);
        return "redirect:/admin/company";
    }

    @GetMapping("/company/edit-{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("company", companyService.findOne(id));
        return "editCompany";
    }
    @GetMapping("/company/createProject-{id}")
    public String createProject(@PathVariable("id") Integer id, Model model) {
//        model.addAttribute("company", companyService.findOne(id));

        return "companyProjects";
    }

    @GetMapping("/company/addContactPersonToCompany-{id}")
    public String addContactPersonToCompany(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("company", companyService.findCompanyByPersonAndProjects(id));

        return "companyContactPersons";
    }
    @PostMapping("/company/addContactPerson")
        public String addContactPerson(Model model,
                                       @RequestParam("idCompany") int idCompany,
                                       @RequestParam("firstName") String firstName,
                                       @RequestParam("lastName") String lastName,
                                       @RequestParam("position") String position,
                                       @RequestParam("email") String email,
                                       @RequestParam("telephone") String telephone) {
        Company company = companyService.findOne(idCompany);
        List<ContactPerson> persons = new ArrayList<>();
        for (ContactPerson person : persons) {
            ContactPerson contactPerson = new ContactPerson(firstName, lastName, position, email, telephone);
            if (person.getFirstName().equals(contactPerson.getFirstName()) || person.getLastName().equals(contactPerson.getLastName()) || person.getEmail().equals(contactPerson.getEmail())) {
                model.addAttribute("key", "This  contact person is olready exists");
            }
            persons.add(contactPerson);
        }
        company.setPersons(persons);
        companyService.save(company);
        return "company/addContactPersonPage";
        }



//    company/update

    @PostMapping("/company/save")
    public String updateCompany(@RequestParam("nameCompany") String nameCompany,
                                @RequestParam("company") int idCompany) {
        Company company = companyService.findOne(idCompany);
        System.out.println(company);
        companyService.save(company);
        return "redirect:/admin/company";
    }


}
