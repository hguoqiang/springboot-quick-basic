package org.ganfan.basic.service.impl;

import org.ganfan.basic.service.UserService;
import org.ganfan.basic.service.dto.UserParam;
import org.ganfan.basic.service.dto.UserResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 20:59
 **/
@Service
public class UserServiceImpl implements UserService {

    /**
     * 获取用户列表
     *
     * @param userParam
     * @return
     */
    @Override
    public Page<UserResult> listUser(Pageable pageable, UserParam userParam) {

        List<UserResult> userResults = new ArrayList<>();


        Page<UserResult> listUserResults = new PageImpl<UserResult>(userResults);

        return listUserResults;
    }
}
