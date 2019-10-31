package com.bigfang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName person
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/10/31 17:14
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
