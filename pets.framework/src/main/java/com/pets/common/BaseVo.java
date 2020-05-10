package com.pets.common;

import com.pets.constant.ServiceResult;

import java.util.HashMap;
import java.util.Map;

public class BaseVo<T> extends HashMap {

    private String responsCode;

    private String responseMsg;


    private T data;

    public String getResponsCode() {
        return responsCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public T getData() {
        return data;
    }

    public void setResponsCode(String responsCode) {
        this.responsCode = responsCode;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static<T> BaseVo<T> succ(T data) {
        BaseVo baseVo = new BaseVo();

        baseVo.setResponsCode(ServiceResult.succ.getCode());
        baseVo.setResponseMsg(ServiceResult.succ.getMsg());

        baseVo.setData(data);

        return baseVo;
    }

    public static<T> BaseVo<T> succ(){

        return succ(null);
    }

    public static<T> BaseVo<T> fail(){

        return fail(ServiceResult.fail);
    }

    public static<T> BaseVo<T> fail(ServiceResult result) {

        BaseVo baseVo = new BaseVo();

        baseVo.setResponsCode(result.getCode());
        baseVo.setResponseMsg(result.getMsg());

        return baseVo;
    }

    public static<T> BaseVo<T> fail(String responsCode,String responseMsg,T data){

        BaseVo baseVo = new BaseVo();

        baseVo.setResponsCode(responsCode);
        baseVo.setResponseMsg(responseMsg);

        baseVo.setData(data);

        return baseVo;
    }

    public static<T> BaseVo<T> fail(String responsCode,String responseMsg) {
        return fail(responsCode,responseMsg,null);
    }

}
