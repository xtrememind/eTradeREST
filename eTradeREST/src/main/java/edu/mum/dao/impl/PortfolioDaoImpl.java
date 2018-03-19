package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.PortfolioDao;
import edu.mum.domain.Portfolio;

@Repository
public class PortfolioDaoImpl extends GenericDaoImpl<Portfolio> implements PortfolioDao {
	public PortfolioDaoImpl() {
		super.setDaoType(Portfolio.class);
		}
}
