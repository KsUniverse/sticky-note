package com.stick.note.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wesoon.web.BaseEntity;
import lombok.Data;

/**
 * 用户表(t_user)实体类
 *
 * @author wxy
 * @since 2021-05-20 17:42:31
 * @description wxy
 */
@Data
@TableName("t_user")
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

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
    private String realName;
    /**
     * 性别 true 男 false 女
     */
    private Boolean sex;
    /**
     * 微信openId
     */
    private String openid;

}