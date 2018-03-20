package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.StockDao;
import edu.mum.domain.Stock;

@Service
@Transactional 
public class StockServiceImpl implements edu.mum.service.StockService {
	
 	@Autowired
	private StockDao stockDao;

 	
     public void save(Stock stock) {  		
  		stockDao.save(stock);
 	}
  	   	
	
	public List<Stock> findAll() {
		return (List<Stock>)stockDao.findAll();
	}

	public Stock findById(Integer Id) {
		return stockDao.findById(Id);
	}
	
	public Stock update(Stock stock) {
		 return stockDao.update(stock);

	}
	@Override
	public Stock findOne(Integer id) {
		 
		return stockDao.findOne(id);
	}

 

}
