package com.atguigu.generator.demo;

import com.atguigu.generator.demo.mapper.UserMapper;
import com.atguigu.generator.demo.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;

@SpringBootTest
class GeneratorDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        //this.userMapper.selectBatchIds(Arrays.asList(1l,2l)).forEach(System.out::println);

        //System.out.println(this.userMapper.selectById(1l));

        //条件构造器
        //this.userMapper.selectList(new QueryWrapper<User>().eq("age",18)).forEach(System.out::println);
       // this.userMapper.selectList(new QueryWrapper<User>().gt("age",18)).forEach(System.out::println);
       /* IPage<User> page = this.userMapper.selectPage(new Page<User>(1, 1), new QueryWrapper<User>().like("name", "j"));
        System.out.println(page.getTotal());
        page.getRecords().forEach(System.out::println);*/
       //this.userMapper.insert(new User(9l,"lijing",22,"181@qq.com"));
        //System.out.println(this.userMapper.selectCount());
        this.userMapper.queryAll().forEach(System.out::println);
    }

}
