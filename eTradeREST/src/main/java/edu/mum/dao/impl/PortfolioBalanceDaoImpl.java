package edu.mum.dao.impl;

 

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.PortfolioBalanceDao;
import edu.mum.domain.PortfolioBalance;


@SuppressWarnings("unchecked")
@Repository
public class PortfolioBalanceDaoImpl extends GenericDaoImpl<PortfolioBalance> implements PortfolioBalanceDao {

	public PortfolioBalanceDaoImpl() {
		super.setDaoType(PortfolioBalance.class );
		}

//	public PortfolioBalance findByEmail(String email) {
//	     
//		Query query = entityManager.createQuery("select u from PortfolioBalance u  where u.email =:email");
//		return (PortfolioBalance) query.setParameter("email", email).getSingleResult();
//
//	}


 }