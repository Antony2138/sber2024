package org.example;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TestAspect {
        private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        private Notebook notebook = context.getBean(Notebook.class);


        @Test
        public void setListException() {
                List<String> list = new ArrayList<>();
                notebook.changeAuthor(null);
                notebook.setText(list);
                notebook.changeAuthor("Tom");
        }
}
