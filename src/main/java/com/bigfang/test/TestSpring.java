package com.bigfang.test;

import com.bigfang.config.AutoConfig;
import com.bigfang.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/10/31 17:19
 * @Version 1.0
 **/
public class TestSpring {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
    
    @Test
    public void testAutoConfigAnnotation(){
        final AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(AutoConfig.class);
        final Person  person = annotationContext.getBean(Person.class);
        System.out.println(person);
		System.out.println(person);
		System.out.println(person);
    }
    
}
