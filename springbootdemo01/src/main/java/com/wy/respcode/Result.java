package com.wy.respcode;


import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xiexin
 * @Date: 2020/11/8 13:24
 * @Version 1.0
 */
@Data
public class Result<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    public Result() {
        this.code = ResultEnums.SUCCESS.getCode();
        this.msg = ResultEnums.SUCCESS.getMsg();
    }

    public Result(String msg) {
        this.code = ResultEnums.SUCCESS.getCode();
        this.msg = msg;
    }

    //带数据

    public Result(T data) {
        this.code = ResultEnums.SUCCESS.getCode();
        this.msg = ResultEnums.SUCCESS.getMsg();
        this.data = data;
    }

    //带数据还带消息
    public Result(String msg, T data) {
        this.code = ResultEnums.SUCCESS.getCode();
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(ResultEnums resultEnum, String msg) {
        this.code = resultEnum.getCode();
        this.msg = msg;
    }

    public Result(ResultEnums resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
