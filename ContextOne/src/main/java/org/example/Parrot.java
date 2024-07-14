package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Scope;

@Data
@AllArgsConstructor
@Scope("prototype")
public class Parrot {
    private String name;
}

