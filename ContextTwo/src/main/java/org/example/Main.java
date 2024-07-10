package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Application app = context.getBean(Application.class);

        app.getBankClientsApp().setClient(true);
        System.out.println(app.checkClient());
    }
}
