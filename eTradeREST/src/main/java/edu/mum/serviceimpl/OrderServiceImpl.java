package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.OrderDao;
import edu.mum.domain.Order;
import edu.mum.domain.User;

@Service
@Transactional 
public class OrderServiceImpl implements edu.mum.service.OrderService {
	
	@Autowired
	private OrderDao orderDao;
	

	@Override
	public void save(Order order) {
		// TODO Auto-generated method stub
		
		orderDao.save(order);
	}

	@Override
	public List<Order> findAll() {
		// TDO Auto-generated method stub
		return (List<Order>)orderDao.findAll();
	}

	@Override
	public Order findOne(Integer id) {
		// TODO Auto-generated method stub
		return orderDao.findOne(id);
	}

	@Override
	public Order update(Order order) {
		// TODO Auto-generated method stub
		return orderDao.update(order);
	}


}
