package cz.people.dao;

import cz.people.entity.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactPersonDAO extends JpaRepository<ContactPerson,Integer> {
}
