package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * ClassName: Pet
 * Package: com.atguigu.boot.bean
 * Description:
 *
 * @Author 李玉龙
 * @Create 2023/8/11 15:48
 * @Version 1.0
 */
@Data
@ToString
public class Pet {
    private String name;
    private Double weight;
}
