package com.nefu.softwarearchitecture.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nefu.softwarearchitecture.entiy.User;
import com.nefu.softwarearchitecture.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(String id){
        return userMapper.selectById(id);
    }

    public User findByUsername(String username){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.select("id","username","password").eq("username",username);
        return userMapper.selectOne(userQueryWrapper);
    }
}
