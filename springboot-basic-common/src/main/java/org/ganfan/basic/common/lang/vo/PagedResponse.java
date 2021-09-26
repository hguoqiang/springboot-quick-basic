package org.ganfan.basic.common.lang.vo;

import java.util.List;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 19:47
 **/
public class PagedResponse<T> extends BaseResponse {
    /**
     * 总页数
     */
    private Integer pages;

    /**
     * 总条数
     */
    private Long total;

    /**
     * 分页数据
     */
    private List<T> data;

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
