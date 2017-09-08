package cz.people.dao;

import cz.people.entity.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactPersonDAO extends JpaRepository<ContactPerson,Integer> {
    @Query("from Company c join c.persons where c.id=:id ")
    List<ContactPerson> findAllPersonsFromCompany(@Param("id") int id);
}
