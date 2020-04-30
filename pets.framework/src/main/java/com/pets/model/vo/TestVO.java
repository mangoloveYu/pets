package com.pets.model.vo;

/**
 * @author 芒果love
 */
public class TestVO {
    private String id;

    private String name;

    private Integer years;

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

    @Override
    public String toString() {
        return "TestVO{" + "id=" + id + '\'' + "name=" + name + '\'' + "years=" + years + '\'' + '}';
    }
}
