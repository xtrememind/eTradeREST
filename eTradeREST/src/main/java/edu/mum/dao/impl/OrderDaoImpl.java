package edu.mum.dao.impl;

import edu.mum.dao.OrderDao;
import edu.mum.domain.Order;
import edu.mum.domain.PortfolioBalance;

public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {
	
	public OrderDaoImpl() {
		super.setDaoType(Order.class );
		}

}
