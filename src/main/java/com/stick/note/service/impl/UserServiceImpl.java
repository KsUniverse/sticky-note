package com.stick.note.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stick.note.entity.User;
import com.stick.note.mapper.UserMapper;
import com.stick.note.vo.UserDetailVO;
import com.stick.note.vo.UserSearchVO;
import com.wesoon.web.page.PageDataUtil;
import com.wesoon.web.page.PageResult;
import lombok.extern.slf4j.Slf4j;
import com.stick.note.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表服务接口实现
 *
 * @author wxy
 * @since 2021-05-20 17:42:31
 * @description wxy
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public PageResult<UserDetailVO> list(UserSearchVO searchVO) {
        Page<User> page = PageDataUtil.buildPage(searchVO);
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
        wrapper.like(StringUtils.isNotBlank(searchVO.getRealName()), User::getRealName, searchVO.getRealName());
        page = userMapper.selectPage(page, wrapper);
        return PageDataUtil.pageResult(page, UserDetailVO.class);
    }
}