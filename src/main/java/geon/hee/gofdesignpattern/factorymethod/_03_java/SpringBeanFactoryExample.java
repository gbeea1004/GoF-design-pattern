package geon.hee.gofdesignpattern.factorymethod._03_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {

    public static void main(String[] args) {
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);

        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        Object hi = javaFactory.getBean("hello", String.class);
    }
}
