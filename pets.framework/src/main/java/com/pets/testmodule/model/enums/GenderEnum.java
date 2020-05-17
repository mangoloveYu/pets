package com.pets.testmodule.model.enums;


/**
 * @author 芒果love
 */
public enum GenderEnum {
    //男
    MAN(1, "男"),
    //女
    WOMAN(2, "女");

    private int index;
    private String value;
    GenderEnum(int index, String value) {
        this.index = index;
        this.value = value;
    }
    public int getIndex() {
        return index;
    }
    public String getValue() {
        return value;
    }
}
