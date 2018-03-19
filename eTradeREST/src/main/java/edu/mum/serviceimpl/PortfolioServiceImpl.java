package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.PortfolioDao;
import edu.mum.domain.Portfolio;
import edu.mum.domain.User;

@Service
@Transactional 
public class PortfolioServiceImpl implements edu.mum.service.PortfolioService {
	
	@Autowired
	private PortfolioDao portfolioDao;
	

	@Override
	public void save(Portfolio portfolio) {
		// TODO Auto-generated method stub
		
		portfolioDao.save(portfolio);
	}

	@Override
	public List<Portfolio> findAll() {
		// TDO Auto-generated method stub
		return (List<Portfolio>)portfolioDao.findAll();
	}

	@Override
	public Portfolio findOne(Long id) {
		// TODO Auto-generated method stub
		return portfolioDao.findOne(id);
	}

	@Override
	public Portfolio update(Portfolio portfolio) {
		// TODO Auto-generated method stub
		return portfolioDao.update(portfolio);
	}
}
