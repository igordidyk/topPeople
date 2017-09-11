package cz.people.controller;

import cz.people.service.CompanyService;
import cz.people.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class DefaultController {
    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home() {
//        employeeService.findEmployeesWithEducationAndLang().forEach(employee -> System.out.println(employee.getLanguage() + " "+ employee.getEducation()));
        return "index";
    }

    @GetMapping("/admin")
    public String adminPage(ModelMap model, Principal principal) {
        model.addAttribute("principal", principal);

        return "admin";
    }

    @GetMapping("/coordinator")
    public String coordinator(Model model,Principal principal) {
        model.addAttribute("coordinatorName", principal.getName());

        return "accountCoordinator";
    }


    @GetMapping("/login")
    public String loginPage(ModelMap model) {
        model.addAttribute("title", "login");
        return "login";
    }


    @GetMapping("status")
    public String status(Model model) {
        model.addAttribute("companies", companyService.findAll());
        return "proceeding_status";
    }

    @GetMapping("/403")
    public String accessDeniedPage(Model model, Principal principal) {
        model.addAttribute("user", principal.getName());
        return "accessDenied";
    }

}
