package com.demo.app;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getRegiune() {
        return regiune;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getTipSport() {
        return tipSport;
    }

    public void setTipSport(String tipSport) {
        this.tipSport = tipSport;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getPerioada() {
        return perioada;
    }

    public void setPerioada(String perioada) {
        this.perioada = perioada;
    }

    @Override
    public String toString() {
        return "Adventure{" +
                "id=" + id +
                ", tara='" + tara + '\'' +
                ", regiune='" + regiune + '\'' +
                ", localitate='" + localitate + '\'' +
                ", tipSport='" + tipSport + '\'' +
                ", cost=" + cost +
                ", perioada='" + perioada + '\'' +
                '}';
    }
}
