package org.ganfan.basic.web.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.ganfan.basic.common.lang.vo.BaseResponse;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 20:34
 **/
@Setter
@Getter
@ApiModel("获取用户列表响应参数")
public class UserResp extends BaseResponse {
    @ApiModelProperty("用户id")
    private String id;

    @ApiModelProperty("用户姓名")
    private String name;

}
