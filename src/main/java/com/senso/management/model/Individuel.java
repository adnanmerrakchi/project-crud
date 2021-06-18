package com.senso.management.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Individuel {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String mail;
    @Enumerated(EnumType.STRING)
    private Profile profile;

    @ManyToMany(targetEntity = Project.class)
    private List<Project> project;


    public Individuel() {
    }

    public Individuel(Long id) {
        this.id = id;
    }

    public Individuel(Long id,
                      String firstName,
                      String lastName,
                      String phone,
                      String mail,
                      Profile profile,
                      List<Project> projects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.mail = mail;
        this.profile = profile;
        this.project = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Project> getProjects() {
        return project;
    }

    public void setProjects(List<Project> projects) {
        this.project = projects;
    }

}
