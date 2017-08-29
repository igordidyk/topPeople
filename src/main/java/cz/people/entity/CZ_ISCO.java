package cz.people.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CZ_ISCO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int czisco;
    private String kkov;
    private String ENG_position;
    private String CZ_position;
    private String numberOfVacancy;
    private String CZ_text;


}
