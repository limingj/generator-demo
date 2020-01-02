package com.atguigu.generator.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2020-01-02 10:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//实体类与表名不对应
@TableName("user")
public class User {
    @TableId(type = IdType.INPUT)   //用户指定Id  指定主键字段
    private Long id;
    @TableField("name") //指定列名
    private String name;
    private Integer age;
    private String email;
}