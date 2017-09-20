package cz.people.dao;

import cz.people.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CompanyDAO extends JpaRepository<Company, Integer> {
    //    @Query("from Company e join fetch e.employees")
//    Company findCompanyWithEmployees();
    @Query("from Company c  join fetch c.persons  where c.id=:id")
    Company findCompanyWithPersons(@Param("id") int id);

}
