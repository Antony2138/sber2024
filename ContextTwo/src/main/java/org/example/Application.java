package org.example;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Data
@Component
public class Application {
    @Autowired
    private TransferByPhoneApp transferByPhoneApp;
    @Autowired
    private DataBase dataBase;
    @Autowired
    private BankClientsApp bankClientsApp;


     public String checkClient(){
        if (bankClientsApp.getClient()){
            return("Is client");
        }
        return ("No client");
    }


    public void transfer(int num, int sum){
        transferByPhoneApp.setNumber(num);
        transferByPhoneApp.setSumma(sum);
    }
    public void  recordToDataBase(){
        dataBase.add(transferByPhoneApp.getNumber(), transferByPhoneApp.getSumma());

    }
}
