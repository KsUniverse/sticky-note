package com.stick.note.controller;

import com.stick.note.service.UserService;
import com.stick.note.vo.UserDetailVO;
import com.stick.note.vo.UserSearchVO;
import com.wesoon.web.page.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 用户表服务控制器
 *
 * @author wxy
 * @since 2021-05-20 17:42:31
 * @description wxy
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("list")
    public PageResult<UserDetailVO> list(@RequestBody @Validated UserSearchVO searchVO) {
        return userService.list(searchVO);
    }
}