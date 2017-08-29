package cz.people.service;


import cz.people.entity.Company;

import java.util.List;

public interface CompanyService {
    void save(Company company);

    void update(Company company);

    Company findOne(int id);

    List<Company> findAll();

    void delete(Company company);

    void delete(int id);

//    Company findCompanyWithEmployees();

}
