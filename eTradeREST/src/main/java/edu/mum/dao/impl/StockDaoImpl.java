package edu.mum.dao.impl;

 

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.StockDao;
import edu.mum.dao.UserDao;
import edu.mum.domain.Stock;
import edu.mum.domain.User;


@SuppressWarnings("unchecked")
@Repository
public class StockDaoImpl extends GenericDaoImpl<Stock> implements StockDao {

	public StockDaoImpl() {
		super.setDaoType(Stock.class );
		}

	public Stock findById(Integer Id) {
	     
		Query query = entityManager.createQuery("select u from Stock u  where u.id =:id");
		return (Stock) query.setParameter("id", Id).getSingleResult();
			     

	}


 }