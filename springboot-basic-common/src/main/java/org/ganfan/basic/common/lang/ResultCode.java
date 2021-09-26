package org.ganfan.basic.common.lang;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 19:47
 **/
public interface ResultCode {

    /**
     * 获取结果码
     * @return
     */
    int getCode();

    /**
     * 获取状态码
     * @return
     */
    int getStatusCode();

    /**
     * 获取MSG
     * @return
     */
    String getMsg();
}
