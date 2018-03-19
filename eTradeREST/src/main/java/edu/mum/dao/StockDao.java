package edu.mum.dao;

import edu.mum.domain.Stock;

public interface StockDao extends GenericDao<Stock> {
      
	public Stock findById(Integer Id);
}
