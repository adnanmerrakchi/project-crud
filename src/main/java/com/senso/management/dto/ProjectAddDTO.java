package com.senso.management.dto;

import com.senso.management.model.Category;
import com.senso.management.model.Individuel;

import java.time.LocalDate;
import java.util.List;

public class ProjectAddDTO {

    private String name;
    private LocalDate kickOffDate;
    private LocalDate deliveryDate;
    private Category category;
    List<Individuel> individuel;

    public ProjectAddDTO() {
    }

    public ProjectAddDTO(   String name,
                            LocalDate kickOffDate,
                            LocalDate deliveryDate,
                            Category category,
                            List<Individuel> individuel) {
        this.name = name;
        this.kickOffDate = kickOffDate;
        this.deliveryDate = deliveryDate;
        this.category = category;
        this.individuel = individuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getKickOffDate() {
        return kickOffDate;
    }

    public void setKickOffDate(LocalDate kickOffDate) {
        this.kickOffDate = kickOffDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Individuel> getIndividuel() {
        return individuel;
    }

    public void setIndividuel(List<Individuel> individuel) {
        this.individuel = individuel;
    }
}
