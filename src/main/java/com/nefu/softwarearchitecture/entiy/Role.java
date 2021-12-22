package com.nefu.softwarearchitecture.entiy;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "t_role")
public class Role implements Serializable {
    private String id;
    private String name;
}
