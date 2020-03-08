package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    public Skill(){

    }

    private String extraSkillDescription;

    public String getExtraSkillDescription() {
        return extraSkillDescription;
    }

    public void setExtraSkillDescription(String extraSkillDescription) {
        this.extraSkillDescription = extraSkillDescription;
    }



}