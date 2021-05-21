package com.stick.note.mapper;

import com.stick.note.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户表(t_user)数据Mapper
 *
 * @author wxy
 * @since 2021-05-20 17:42:31
 * @description wxy
*/
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
