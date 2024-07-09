package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config{

    @Bean
    Cat cat() {
        return new Cat("Бобик");
    }

    @Bean
    Dog dog() {
        return new Dog("Барсик");
    }

    @Bean
    Parrot parrot() {
        return new Parrot("голубчик");
    }

    @Bean
    Parrot parrot2() {
        return new Parrot("жемчужинка");
    }

    @Bean
    People man(Cat cat, Dog dog, Parrot parrot, Parrot parrot2) {
        return new People(cat, dog, parrot, parrot2);
    }

}
