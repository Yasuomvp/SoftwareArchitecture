package com.nefu.softwarearchitecture.service;


import com.nefu.softwarearchitecture.entiy.Role;
import com.nefu.softwarearchitecture.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public Role findById(String id){
        return roleMapper.selectById(id);
    }

    public Set<Role> findRolesByUsername(String username){
        return roleMapper.findRolesByUsername(username);
    }
}
