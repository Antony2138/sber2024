package org.example;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@Component
public class DataBase {
    private List<Integer> history;

    public void add(int  num, int sum){
        history.add(num);
        history.add(sum);

    }
}
