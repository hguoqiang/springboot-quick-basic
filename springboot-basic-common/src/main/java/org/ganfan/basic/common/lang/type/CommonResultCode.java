package org.ganfan.basic.common.lang.type;

import org.ganfan.basic.common.lang.ResultCode;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 20:45
 **/
public enum CommonResultCode implements ResultCode {
    SUCCESS(00000, "请求成功"),
    SYSTEM_ERROR(99999, "系统错误"),
    ;

    /**
     * 结果码
     */
    private int code;

    /**
     * 状态码
     */
    private int statusCode;

    /**
     * 结果消息
     */
    private String msg;

    CommonResultCode(int code, String msg) {
        this(code, -1, msg);
    }

    CommonResultCode(int code, int statusCode, String msg) {
        this.code = code;
        this.statusCode = statusCode;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
