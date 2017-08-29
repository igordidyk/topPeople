package cz.people.dao;

import cz.people.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
    @Query("from Employee e join fetch e.address")
    List<Employee> findEmployeesWithAddress();

//    @Query("from Employee e   join fetch e.education  join  e.language  ")
//    List<Employee> findEmployeesWithEducationAndLang();

//    @Query("from Employee e   join fetch e.education  join  e.language where e.id=:id")
//    Employee findOneEmployeeWithEducationAndLang(@Param("id") int id);


}
