package org.ganfan.basic.service;

import org.ganfan.basic.service.dto.UserParam;
import org.ganfan.basic.service.dto.UserResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-09-23 20:59
 **/
public interface UserService {

    Page<UserResult> listUser(Pageable pageable, UserParam userParam);
}
