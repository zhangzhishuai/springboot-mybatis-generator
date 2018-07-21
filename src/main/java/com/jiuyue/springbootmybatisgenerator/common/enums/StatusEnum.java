package com.jiuyue.springbootmybatisgenerator.common.enums;

public enum StatusEnum {
    INVALID(0,"无效"),
    VALID(1,"有效");

    private Integer code;
    private String msg;

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        StatusEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            StatusEnum iEnum = arr[i];
            if (iEnum.getCode().equals(code)) {
                return iEnum.getMsg();
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
