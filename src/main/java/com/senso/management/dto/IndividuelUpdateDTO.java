package com.senso.management.dto;

import com.senso.management.model.Profile;

public class IndividuelUpdateDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private Profile profile;

    public IndividuelUpdateDTO() {
    }

    public IndividuelUpdateDTO( Long id,
                                String firstName,
                                String lastName,
                                String phone,
                                Profile profile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.profile = profile;
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
