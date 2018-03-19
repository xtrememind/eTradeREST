package edu.mum.service;

import java.util.List;

import edu.mum.domain.Portfolio;

//
public interface PortfolioService {
	
	public void save(Portfolio portfolio);
	public List<Portfolio> findAll();
	public Portfolio findOne(Long id);
	public Portfolio update(Portfolio portfolio);


}
