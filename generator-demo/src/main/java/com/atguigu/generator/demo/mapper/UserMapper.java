package com.atguigu.generator.demo.mapper;

import com.atguigu.generator.demo.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-01-02 10:59
 */
public interface UserMapper extends BaseMapper<User> {

    //自定义查询方法
       // （1）注解方式
        @Select("select count(*) from user")
    public Integer selectCount();
     // （2）配置方式
        //a.编写mapper.xml
       //b.mybatis-plus.type-aliases-package=com.atguigu.generator.demo.pojo 开启别名

    public List<User> queryAll();
}
