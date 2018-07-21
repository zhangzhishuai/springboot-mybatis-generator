package com.jiuyue.springbootmybatisgenerator.common.entity;


import com.jiuyue.springbootmybatisgenerator.common.enums.ErrorCodeEnum;

import java.io.Serializable;

public class BizResult<T> implements Serializable {

    /**
     * 成功标识
     */
    private boolean success = false;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 返回结果code
     */
    private String code;

    /**
     * 返回信息
     */
    private String message;

    public BizResult() {

    }

    public BizResult(boolean success, T data, String code, String message) {
        this.success = success;
        this.data = data;
        this.code = code;
        this.message = message;
    }

    /**
     * @return DubboResult<T>
     */
    public static <T> BizResult<T> create() {
        return new BizResult<T>();
    }

    /**
     * 快速创建Result的方法 -create DubboResult<T> Object for successful cases.
     *
     * @param data result data
     * @return DubboResult<T>
     */
    public static <T> BizResult<T> create(T data) {
        BizResult<T> result = BizResult.create();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    /**
     * 接口调用成功时也需要code和message的场景
     *
     * @param data
     * @param code
     * @param message
     * @return DubboResult<T>
     */
    public static <T> BizResult<T> create(T data, String code, String message) {
        BizResult<T> result = BizResult.create();
        result.setSuccess(true);
        result.setData(data);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    /**
     * 任意场景
     *
     * @param isSuccess
     * @param code
     * @param message
     * @param data
     * @return DubboResult<T>
     */
    public static <T> BizResult<T> create(boolean isSuccess, String code, String message, T data) {
        BizResult<T> result = BizResult.create();
        result.setSuccess(isSuccess);
        result.setData(data);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    /**
     * create DubboResult<T> Object for unsuccessful cases.
     *
     * @param code    result code
     * @param message result code
     * @return DubboResult<T>
     */
    public static <T> BizResult<T> create(String code, String message) {
        BizResult<T> result = BizResult.create();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    /**
     * @param errorCodeEnum
     * @param <T>
     * @return DubboResult<T>
     */
    public static <T> BizResult<T> create(ErrorCodeEnum errorCodeEnum) {
        BizResult<T> result = BizResult.create();
        result.setSuccess(false);
        result.setCode(errorCodeEnum.getErrCode());
        result.setMessage(errorCodeEnum.getErrMsg());
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
