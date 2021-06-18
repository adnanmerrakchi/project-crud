package com.senso.management.dto;

import com.senso.management.model.Individuel;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ProjectUpdateDTO implements Serializable {

    private Long id;
    private String name;
    private LocalDate deliveryDate;
    List<Individuel> individuels;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<Individuel> getIndividuels() {
        return individuels;
    }

    public void setIndividuels(List<Individuel> individuels) {
        this.individuels = individuels;
    }
}
