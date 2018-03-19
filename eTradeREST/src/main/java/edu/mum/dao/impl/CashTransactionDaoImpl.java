package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CashTransactionDao;
import edu.mum.domain.CashTransaction;
import edu.mum.domain.User;

@SuppressWarnings("unchecked")
@Repository
public class CashTransactionDaoImpl extends GenericDaoImpl<CashTransaction> implements CashTransactionDao {
	
	public CashTransactionDaoImpl() {
		super.setDaoType(CashTransaction.class );
		}

}
