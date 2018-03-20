package edu.mum.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mum.domain.Client;



public interface ClientService {
	public void save(Client client);
	public List<Client> findAll();
	public Client findOne(Integer id);
	public Client findByEmail(String email);
	public Client update(Client client);
	public void saveFull( Client client);

}