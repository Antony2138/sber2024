package org.example.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.ClientRepository;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public Client saveClient(Client client){
        if(clientRepository.isClient(client) == null){
            return null;
        }
        clientRepository.regClient(client);
        return client;
    }

    public Client searchClient(long id){
        return clientRepository.getClient(id);
    }


}
