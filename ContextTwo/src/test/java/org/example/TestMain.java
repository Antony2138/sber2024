package org.example;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    @Test
    public void firstTest(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Application app = context.getBean(Application.class);

        app.getBankClientsApp().setClient(true);
        System.out.println(app.checkClient());
    }
}
