package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CashAccountDao;
import edu.mum.domain.CashAccount;
import edu.mum.domain.Order;

@SuppressWarnings("unchecked")
@Repository
public class CashAccountDaoImpl  extends GenericDaoImpl<CashAccount> implements CashAccountDao {
	
	public CashAccountDaoImpl() {
		super.setDaoType(CashAccount.class );
		}

}
