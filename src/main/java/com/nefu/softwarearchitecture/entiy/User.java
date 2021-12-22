package com.nefu.softwarearchitecture.entiy;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@TableName(value = "t_user")
public class User implements Serializable {
    private String id;
    private String username;
    private String password;
    private Set<Role> RoleSet = new HashSet();
}
