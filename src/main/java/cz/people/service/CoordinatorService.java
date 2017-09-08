package cz.people.service;

import cz.people.entity.Coordinator;

import java.util.List;

public interface CoordinatorService {

    void save(Coordinator coordinator);

    Coordinator findOne(int id);

    List<Coordinator> findAll();

    void delete(Coordinator coordinator);

    void delete(int id);


//    Coordinator finCoordinatorWithEmploees();

    Coordinator findByName(String name);
}
