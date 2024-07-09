package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.Cat;
import org.example.Dog;
import org.example.Parrot;


@Data
@AllArgsConstructor
public class People {

    private Cat cat;
    private Dog dog;
    private Parrot parrot;
    private Parrot parrot2;


}