package com.pets.testmodule.model.entity;

/**
 * @author 芒果love
 */
public class Tests {
    private String id;

    private String name;

    private Integer years;

    public Short gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() { return years; }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Short getGender(){ return gender; }

    public void setGender() { this.gender = gender; }
}