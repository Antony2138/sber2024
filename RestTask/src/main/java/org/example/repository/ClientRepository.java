package org.example.repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.model.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@AllArgsConstructor
@NoArgsConstructor
public class ClientRepository {
    private long id = -1;
    private List<Client> clientList = new ArrayList<Client>();

    public void regClient(Client client){
        id++;
        client.setId(id);
        clientList.add(client);
    }

    public Client getClient(long id){
        return clientList.stream().filter(client -> client.getId() == id).findAny().orElse(null);
    }

    public Client isClient(Client client){
        return clientList.stream().filter(x -> x.getLogin() == client.getLogin()).findAny().orElse(null);
    }

}
