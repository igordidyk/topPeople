package cz.people.service.impl;


import cz.people.dao.CoordinatorDAO;
import cz.people.entity.Coordinator;
import cz.people.service.CoordinatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CoordinatorServiceImpl implements CoordinatorService,UserDetailsService {
    @Autowired
    private CoordinatorDAO dao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void save(Coordinator coordinator) {
        coordinator.setPassword(passwordEncoder.encode(coordinator.getPassword()));
        dao.save(coordinator);
    }

    @Override
    public Coordinator findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public List<Coordinator> findAll() {
        return dao.findAll();
    }

    @Override
    public void delete(Coordinator coordinator) {
        dao.delete(coordinator);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

//    @Override
//    public Coordinator finCoordinatorWithEmploees() {
//        return dao.finCoordinatorWithEmploees();
//    }

    @Override
    public Coordinator findByName(@Param("username") String name) {
        return dao.findByUserName(name);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByName(username);
    }
}
