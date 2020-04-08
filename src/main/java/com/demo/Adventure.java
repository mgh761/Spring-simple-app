package com.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Adventure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long   id;
    private String tara;
    private String regiune;
    private String localitate;
    private String tipSport;
    private int    cost;
    private String perioada;

    public Adventure() {
    }
}