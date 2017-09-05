package cz.people.service;


import cz.people.entity.ContactPerson;

import java.util.List;

public interface ContactPersonService {


    void save(ContactPerson person);

    ContactPerson findOne(int id);

    List<ContactPerson> findAll();

    void delete(ContactPerson person);

    void delete(int id);


}
