package edu.mum.dao.impl;

import org.springframework.stereotype.Repository;

import edu.mum.dao.OrderDao;
import edu.mum.domain.Order;
import edu.mum.domain.PortfolioBalance;

@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
	
	public OrderDaoImpl() {
		super.setDaoType(Order.class );
		}

}
