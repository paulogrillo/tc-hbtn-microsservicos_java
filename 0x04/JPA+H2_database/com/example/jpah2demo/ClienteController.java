package com.example.jpah2demo;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;
  
  @Autowired
  ModelMapper modelMapper;

  @PostMapping("/addClient")
  public Cliente addClient(@RequestBody Cliente cliente) {
	  Cliente saveCliente = this.modelMapper.map(cliente, Cliente.class);
	return clienteRepository.save(saveCliente);
	 
  }

  @GetMapping("/findAllClients")
  public ResponseEntity<List<Cliente>> findAllClients() {
	  return ResponseEntity.ok(clienteRepository.findAll());
  }

  @GetMapping("/findClientById/{id}")
  public ResponseEntity<Optional<Cliente>> findClientById(@PathVariable("id") Long idClient) {
	  return ResponseEntity.ok(clienteRepository.findById(idClient));
  }

  	@DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
  		clienteRepository.deleteById(idClient);
    }
  	
  	 @PutMapping("/updateClientById/{id}")
     @ResponseStatus(HttpStatus.NO_CONTENT)
     public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        clienteRepository.findById(id).map(clienteElement -> {
            modelMapper.map(cliente, clienteElement);
            clienteRepository.save(clienteElement);
            return Void.TYPE;
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
     }
  	
}