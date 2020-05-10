package com.pets.constant;

import org.assertj.core.api.Fail;

public enum ServiceResult {

    succ("000000","successful"),

    fail("900101","system fail");

    private String code;

    private String msg;

    ServiceResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
