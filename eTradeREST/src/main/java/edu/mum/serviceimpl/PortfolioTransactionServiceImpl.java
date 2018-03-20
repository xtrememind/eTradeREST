package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.PortfolioTransactionDao;
import edu.mum.domain.PortfolioTransaction;
import edu.mum.domain.User;

@Service
@Transactional 
public class PortfolioTransactionServiceImpl implements edu.mum.service.PortfolioTransactionService {
	
	@Autowired
	private PortfolioTransactionDao portfolioTransactionDao;
	

	@Override
	public void save(PortfolioTransaction portfolioTransaction) {
		// TODO Auto-generated method stub
		
		portfolioTransactionDao.save(portfolioTransaction);
	}

	@Override
	public List<PortfolioTransaction> findAll() {
		// TDO Auto-generated method stub
		return (List<PortfolioTransaction>)portfolioTransactionDao.findAll();
	}

	@Override
	public PortfolioTransaction findOne(Integer id) {
		// TODO Auto-generated method stub
		return portfolioTransactionDao.findOne(id);
	}

	@Override
	public PortfolioTransaction update(PortfolioTransaction portfolioTransaction) {
		// TODO Auto-generated method stub
		return portfolioTransactionDao.update(portfolioTransaction);
	}


}
