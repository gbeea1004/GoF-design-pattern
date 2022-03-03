package geon.hee.gofdesignpattern.abstractfactory._03_java;

import geon.hee.gofdesignpattern.abstractfactory._02_after.Ship;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = ac.getBean(Ship.class); // ShipFactory 안의 Ship
        System.out.println("bean = " + bean);
    }
}
