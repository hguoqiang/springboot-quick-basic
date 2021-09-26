package org.ganfan.basic.web.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.ganfan.basic.common.lang.vo.PagedRequest;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 20:33
 **/
@Setter
@Getter
@ApiModel("获取用户列表请求参数")
public class UserQueryReq extends PagedRequest {

    /**
     * 用户状态
     */
    @ApiModelProperty("用户状态")
    @NotEmpty(message = "用户状态不能为空")
    @Range(min = -1, max = 1, message = "用户状态有误")
    private String status;
}
