package edu.mum.service;

import java.util.List;

import edu.mum.domain.Order;
import edu.mum.domain.User;

public interface OrderService {
	
	public void save(Order order);
	public List<Order> findAll();
	public Order findOne(Long id);
	public Order update(Order order);


}
