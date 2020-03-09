package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    public Skill(){

    }

    private String description;

    public String description() {
        return description;
    }

    public void description(String description) {
        this.description = description;
    }



}