package com.stick.note.service;


import com.stick.note.vo.UserDetailVO;
import com.stick.note.vo.UserSearchVO;
import com.wesoon.web.page.PageResult;

/**
 * 用户表服务接口
 *
 * @author wxy
 * @since 2021-05-20 17:42:31
 * @description wxy
 */
public interface UserService {

    PageResult<UserDetailVO> list(UserSearchVO searchVO);
}
