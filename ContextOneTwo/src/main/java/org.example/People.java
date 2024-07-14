package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
public class People {

    private Cat cat;

    private Dog dog;

    private Parrot parrot;

    private Parrot parrot1;
    private Parrot parrot228;

}