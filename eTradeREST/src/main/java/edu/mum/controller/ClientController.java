package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Client;
import edu.mum.service.ClientService;

@RestController
@RequestMapping({"/clients"})
public class ClientController {

	
	@Autowired
	private ClientService  clientService;
	
	@RequestMapping
	public List<Client>  listUsers(Model model) {
		return clientService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Client getClientById(@PathVariable("id") Long id) {
		return clientService.findOne(id);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Client processAddNewClientForm(@RequestBody Client clientToBeAdded) {
	   clientService.save(clientToBeAdded);
	   return null;
	}
}
