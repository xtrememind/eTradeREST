package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.PortfolioTransactionDao;
import edu.mum.domain.PortfolioTransaction;

@Repository
public class PortfolioTransactionDaoImpl extends GenericDaoImpl<PortfolioTransaction> implements PortfolioTransactionDao {
	
	public PortfolioTransactionDaoImpl() {
		super.setDaoType(PortfolioTransaction.class );
		}

}
