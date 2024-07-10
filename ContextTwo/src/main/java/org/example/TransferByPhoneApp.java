package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TransferByPhoneApp {
    private int number;
    private int summa;

}
