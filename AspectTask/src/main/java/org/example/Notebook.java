package org.example;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Notebook {

    private String author;
    private List<String> text = new ArrayList<>();

    @NotEmpty
    public void changeAuthor(String author){
        this.author = author;
    }
    @NotEmpty
    public void setText(List<String> text) {
        this.text = text;
    }

}
