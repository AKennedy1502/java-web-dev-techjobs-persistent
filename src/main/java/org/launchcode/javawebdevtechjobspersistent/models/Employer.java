package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {


    private String location;

    public Employer(){

    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        location = location;
    }



}
