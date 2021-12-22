package com.nefu.softwarearchitecture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nefu.softwarearchitecture.entiy.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
