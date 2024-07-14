package org.example.controller;

import org.example.model.Client;
import org.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

@RestController
@RequestMapping("Client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping
    public ResponseEntity<String> clientReg(@RequestBody Client client) throws URISyntaxException {
        Client client1 = clientService.saveClient(client);
        if (client1 != null) {
            return ResponseEntity.created(new URI("http://localhost:8080/client/" + client1)).build();
        }
        return new ResponseEntity<String>("Client with such login already exists", HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Client> clientGet(@PathVariable long id){
        Optional<Client> searched = Optional.ofNullable(clientService.searchClient(id));
        return searched.isPresent()
                ? ResponseEntity.ok().body(searched.get())
                : ResponseEntity.notFound().build();
    }
}
