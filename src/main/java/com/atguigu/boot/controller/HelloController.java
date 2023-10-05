package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author 李玉龙
 * @Create 2023/8/11 16:35
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    Person person;
    @RequestMapping("/person")
    public Person person(){
        return person;
    }

}
