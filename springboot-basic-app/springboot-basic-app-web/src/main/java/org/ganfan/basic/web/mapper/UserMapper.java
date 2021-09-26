package org.ganfan.basic.web.mapper;

import org.ganfan.basic.service.dto.UserParam;
import org.ganfan.basic.service.dto.UserResult;
import org.ganfan.basic.web.vo.request.UserQueryReq;
import org.ganfan.basic.web.vo.response.UserResp;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-26 16:50
 **/
@Mapper
public interface UserMapper {

    UserParam userQueryReqToUserParam(UserQueryReq userQueryReq);

    List<UserResp> UserResultToUserResp(List<UserResult> userResults);
}
