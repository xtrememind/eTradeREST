package edu.mum.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.ClientDao;
import edu.mum.domain.Client;
import edu.mum.domain.User;

@SuppressWarnings("unchecked")
@Repository
public class ClientDaoImpl extends GenericDaoImpl<Client> implements ClientDao{

	
	public ClientDaoImpl() {
		super.setDaoType(Client.class );
		}
	@Override
	public Client findByEmail(String email) {
		return null;
	}

	
}
