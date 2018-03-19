package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.ClientDao;
import edu.mum.domain.Client;
import edu.mum.service.ClientService;
import edu.mum.service.PortfolioBalanceService;
import edu.mum.service.UserCredentialsService;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientDao clientDao;
	
	@Autowired
	UserCredentialsService credentialsService;
	
	@Autowired
	PortfolioBalanceService PortfolioService;
	
	@Override
	public void save(Client client) {
		// TODO Auto-generated method stub
		clientDao.save(client);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientDao.findAll();
	}

	@Override
	public Client findOne(Long id) {
		// TODO Auto-generated method stub
		return clientDao.findOne(id);
	}

	@Override
	public Client findByEmail(String email) {
		// TODO Auto-generated method stub
		return clientDao.findByEmail(email);
	}

	@Override
	public Client update(Client client) {
		
		// TODO Auto-generated method stub
		return clientDao.update(client);
	}

	@Override
	public void saveFull(Client client) {
		// TODO Auto-generated method stub
		credentialsService.save(client.getUserCredentials());
		//PortfolioService.save(client.getPortfolio());
		clientDao.save(client);
	}

}
