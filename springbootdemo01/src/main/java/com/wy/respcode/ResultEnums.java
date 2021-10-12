package com.wy.respcode;

import lombok.Getter;

/**
 * @Author: xiexin
 * @Date: 2020/11/8 13:23
 * @Version 1.0
 *
 *  //封装了 key  value
 */
@Getter
public enum ResultEnums {
    /**
     * 除20000外，其余都是失败，每个返回码代表具体的失败场景
     */
    SUCCESS(20000, "操作成功"),
    ERROR(40000, "操作失败！"),
    DATA_NOT_FOUND(40001, "查询失败！"),
    PARAMS_NULL(40002, "参数不能为空！"),
    PARAMS_ERROR(40005, "参数不合法！"),
    NO_LOGIN(40006, "用户未登录"),
    LOGIN_PARAM_ERROR(40007, "用户名或密码错误"),
    MENU_EXISTS(40008, "菜单已存在"),
    FILE_TYPE_ERROR(40009, "文件类型不支持"),
    DIR_NOT_FOUND(40010, "文件夹不存在"),
    FILE_TOO_LARGE(40011, "文件过大"),
    AUTH_NOT_FOUNT(40012, "权限不足"),
    CATEGORY_EXISTS(40013, "分类已存在"),
    LOGIN_ERROR(40014, "登录失败"),
    USER_NOT_FOUND(40015, "用户不存在"),
    USER_REAL_EXISTS(40016, "用户已存在");

    private Integer code;
    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
