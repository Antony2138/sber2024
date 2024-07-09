package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        People egor = context.getBean(People.class);
//        System.out.println(egor.getCat().getName());
        context.close();
    }
}
