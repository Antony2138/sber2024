package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class TestAspect {
        private static final Log log = LogFactory.getLog(TestAspect.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Notebook notebook = context.getBean(Notebook.class);


        @Test
        public void setListException() {
                List<String> list = new ArrayList<>();
                notebook.changeAuthor(null);
                notebook.setText(list);
                notebook.changeAuthor("Tom");
        }
}
