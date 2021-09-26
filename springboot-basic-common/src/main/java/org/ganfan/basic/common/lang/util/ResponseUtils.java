package org.ganfan.basic.common.lang.util;

import org.ganfan.basic.common.lang.ResultCode;
import org.ganfan.basic.common.lang.type.CommonResultCode;
import org.ganfan.basic.common.lang.vo.PagedResponse;
import org.ganfan.basic.common.lang.vo.ResponseVO;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 19:48
 **/
public class ResponseUtils {

    public static <T> ResponseVO<T> createSuccess(T data) {
        return create(CommonResultCode.SUCCESS, data);
    }

    public static <T> ResponseVO<T> create(ResultCode resultCode, T data) {
        return create(resultCode.getCode(), resultCode.getMsg(), data);
    }

    public static ResponseVO create(ResultCode resultCode) {
        return create(resultCode.getCode(), resultCode.getMsg());
    }

    public static ResponseVO create(int code, String msg) {
        return create(code, msg, null);
    }

    public static <T> ResponseVO<T> create(int code, String msg, String[] errorExtend) {
        ResponseVO<T> resp = new ResponseVO<>();
        resp.setCode(code);
        resp.setMessage(msg);
        return resp;
    }

    public static <T> ResponseVO<T> create(int code, String msg, T data) {
        ResponseVO<T> resp = new ResponseVO<>();
        resp.setCode(code);
        resp.setMessage(msg);
        resp.setData(data);
        return resp;
    }

    public static boolean isSuccess(ResponseVO response) {
        if (CommonResultCode.SUCCESS.getCode() == response.getCode()) {
            return true;
        }
        return false;
    }

    public static <T> ResponseVO<PagedResponse<T>> createSuccessPagedResponse(Page<?> pagedResult, List<T> data) {
        return createSuccess(createPagedResponse(pagedResult, data));
    }

    private static <T> PagedResponse<T> createPagedResponse(Page<?> page, List<T> data) {
        PagedResponse<T> resp = new PagedResponse<>();
        resp.setTotal(page.getTotalElements());
        resp.setPages(page.getTotalPages());
        resp.setData(data == null ? new ArrayList<>() : data);
        return resp;
    }
}
