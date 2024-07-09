package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        People human = context.getBean(People.class);
        human.getParrot().setName("Кеша");
        human.getCat().setName("Тюбик");
        human.getDog().setName("Нормик");
        human.getParrot1().setName("Бэмсик");
        human.getParrot228().setName("лолик");


        System.out.println(human.getCat().getName());
        System.out.println(human.getParrot228().getName());
        System.out.println(human.getDog().getName());
    }
}