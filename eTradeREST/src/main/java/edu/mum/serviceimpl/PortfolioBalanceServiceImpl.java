package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.PortfolioBalanceDao;
import edu.mum.domain.PortfolioBalance;

@Service
@Transactional 
public class PortfolioBalanceServiceImpl implements edu.mum.service.PortfolioBalanceService {
	
 	@Autowired
	private PortfolioBalanceDao portfolioBalanceDao;


 	
     public void save( PortfolioBalance portfolioBalance) {  		
  		portfolioBalanceDao.save(portfolioBalance);
 	}
     	
	
	public List<PortfolioBalance> findAll() {
		return (List<PortfolioBalance>)portfolioBalanceDao.findAll();
	}

//	public PortfolioBalance findByEmail(String email) {
//		return portfolioBalanceDao.findByEmail(email);
//	}
	
	public PortfolioBalance update(PortfolioBalance portfolioBalance) {
		 return portfolioBalanceDao.update(portfolioBalance);

	}

	@Override
	public PortfolioBalance findOne(Integer id) {
		 
		return portfolioBalanceDao.findOne(id);
	}
 

}
