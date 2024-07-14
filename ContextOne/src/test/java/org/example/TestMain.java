package org.example;


import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
   @Test
    public void TestFirst() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        People egor = context.getBean(People.class);
        System.out.println(egor.getCat().getName());
        context.close();
    }
}
