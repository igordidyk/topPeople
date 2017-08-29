package cz.people.service.impl;

import cz.people.dao.EmployeeDAO;
import cz.people.entity.Employee;
import cz.people.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO dao;

    @Override
    public void save(Employee employee) {
        dao.save(employee);
    }

    @Override
    public Employee findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(Employee employee) {
        dao.delete(employee);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public List<Employee> findEmployeesWithAddress() {
        return dao.findEmployeesWithAddress();
    }

//    @Override
//    public List<Employee> findEmployeesWithEducationAndLang() {
//        return dao.findEmployeesWithEducationAndLang();
//    }
//
//    @Override
//    public Employee findOneEmployeeWithEducationAndLang(int id) {
//        return dao.findOneEmployeeWithEducationAndLang(id);
//    }


}
