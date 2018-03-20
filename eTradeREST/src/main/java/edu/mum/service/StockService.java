package edu.mum.service;

import java.util.List;

import edu.mum.domain.Stock;
 
public interface StockService {

	public void save(Stock stock);
	public List<Stock> findAll();
	public Stock findOne(Integer id);
	public Stock findById(Integer Id);
	public Stock update(Stock user);		

}
