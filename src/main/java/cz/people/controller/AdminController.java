package cz.people.controller;

import cz.people.entity.Company;
import cz.people.entity.Coordinator;
import cz.people.service.CompanyService;
import cz.people.service.CoordinatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String addCompany(@RequestParam("nameCompany") String nameCompany) {
//        Company company = new Company(nameCompany);
//        System.out.println(company);
//        companyService.save(company);
        return "redirect:/admin";
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
