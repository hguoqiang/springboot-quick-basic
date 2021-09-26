package org.ganfan.basic.common.lang.vo;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 19:47
 **/
public class PagedRequest extends BaseRequest {

    /**
     * 页号
     */
    private Integer pageNum = 1;

    /**
     * 单页大小(rows)
     */
    private Integer pageSize = 10;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
