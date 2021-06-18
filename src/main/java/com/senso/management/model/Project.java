package com.senso.management.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDate kickOffDate;

    private LocalDate deliveryDate;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToMany
    @JoinTable(
            name = "PROJECT_INDIV",
            joinColumns = {@JoinColumn(name = "PI_PROJECT_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PI_INDIV_ID")}
    )
    List<Individuel> individuels;

    public Project() {
    }

    public Project(Long id, String name, LocalDate kickOffDate, LocalDate deliveryDate, Category category,
                   List<Individuel> individuels) {
        this.id = id;
        this.name = name;
        this.kickOffDate = kickOffDate;
        this.deliveryDate = deliveryDate;
        this.category = category;
        this.individuels = individuels;
    }

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

    public List<Individuel> getIndividuels() {
        return individuels;
    }

    public void setIndividuels(List<Individuel> individuel) {
        this.individuels = individuel;
    }

}
