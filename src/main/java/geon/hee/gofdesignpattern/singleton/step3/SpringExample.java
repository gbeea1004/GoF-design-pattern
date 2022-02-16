package geon.hee.gofdesignpattern.singleton.step3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello1 = ac.getBean("hello", String.class);
        String hello2 = ac.getBean("hello", String.class);

        System.out.println(hello1 == hello2);
    }
}

@Configuration
class SpringConfig {

    /**
     * 스프링에서 빈의 스코프 중 하나로 싱글톤 스코프
     */
    @Bean
    public String hello() {
        return "hello";
    }
}