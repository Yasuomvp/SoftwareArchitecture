package com.nefu.softwarearchitecture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nefu.softwarearchitecture.entiy.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {

    @Select("select r.* from t_user_role ur,t_role r where ur.role_id = r.id and ur.user_id = 1")
    Set<Role> findRolesByUsername(String username);

}
