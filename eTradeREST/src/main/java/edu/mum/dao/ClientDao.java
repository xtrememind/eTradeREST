package edu.mum.dao;

import edu.mum.domain.Client;

public interface ClientDao extends GenericDao<Client>{

	public Client findByEmail(String email);
}
