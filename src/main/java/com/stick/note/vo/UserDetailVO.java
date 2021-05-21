package com.stick.note.vo;

import lombok.Data;

@Data
public class UserDetailVO {

    private Long id;
    /**
     * 登陆账号
     */
    private String username;
    /**
     * 登陆密码
     */
    private String password;
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 性别 true 男 false 女
     */
    private Boolean sex;

}
