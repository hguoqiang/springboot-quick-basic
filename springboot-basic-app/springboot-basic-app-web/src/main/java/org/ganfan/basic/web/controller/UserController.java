package org.ganfan.basic.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.ganfan.basic.common.lang.util.ResponseUtils;
import org.ganfan.basic.common.lang.vo.PagedResponse;
import org.ganfan.basic.common.lang.vo.ResponseVO;
import org.ganfan.basic.service.UserService;
import org.ganfan.basic.service.dto.UserParam;
import org.ganfan.basic.service.dto.UserResult;
import org.ganfan.basic.web.mapper.UserMapper;
import org.ganfan.basic.web.vo.request.UserQueryReq;
import org.ganfan.basic.web.vo.response.UserResp;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 11:30
 **/
@Api(tags = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     *
     * @param userQueryReq 请求参数
     * @return 用户列表
     */
    @ApiOperation("获取用户列表")
    @GetMapping("/listUser")
  /*  @ApiResponses(
            @ApiResponse(code = 200, message = "操作成功", response = UserResp.class)
    )*/
    public ResponseVO<PagedResponse<UserResp>> listUser(@Validated UserQueryReq userQueryReq) {

        UserMapper userMapper = Mappers.getMapper(UserMapper.class);
        UserParam userParam = userMapper.userQueryReqToUserParam(userQueryReq);
        Integer pageNum = userQueryReq.getPageNum();
        Integer pageSize = userQueryReq.getPageSize();

        Pageable pageable = PageRequest.of(pageNum - 1 < 0 ? 0 : pageNum, pageSize);
        Page<UserResult> listUserResults = userService.listUser(pageable, userParam);

        List<UserResp> resps = userMapper.UserResultToUserResp(listUserResults.getContent());

        return ResponseUtils.createSuccessPagedResponse(listUserResults, resps);
    }


}
