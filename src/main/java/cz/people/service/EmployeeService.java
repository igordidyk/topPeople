package cz.people.service;

import cz.people.entity.Employee;

import java.util.List;


public interface EmployeeService {

    void save(Employee employee);

    Employee findOne(int id);

    List<Employee> findAll();

    void delete(Employee employee);

    void delete(int id);

    List<Employee> findEmployeesWithAddress();

//    List<Employee> findEmployeesWithEducationAndLang();

//    Employee findOneEmployeeWithEducationAndLang(int id);

}
