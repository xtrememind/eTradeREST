package edu.mum.dao;

import java.util.List;

import edu.mum.domain.CashAccount;

public interface CashAccountDao  extends GenericDao<CashAccount>{
	
	public CashAccount findOnefull(Integer id);
	public List<CashAccount> findfull();

}
