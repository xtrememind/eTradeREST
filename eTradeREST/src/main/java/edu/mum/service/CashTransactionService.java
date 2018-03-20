package edu.mum.service;

import java.util.List;

import edu.mum.domain.CashTransaction;

public interface CashTransactionService {
	
	public void save(CashTransaction cashTransaction);
	public List<CashTransaction> findAll();
	public CashTransaction findOne(Integer id);
	public CashTransaction update(CashTransaction cashTransaction);
	

}
