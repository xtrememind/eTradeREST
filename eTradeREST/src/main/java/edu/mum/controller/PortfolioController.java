package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.Portfolio;
import edu.mum.service.PortfolioService;

@RestController
@RequestMapping ({"/portfolios"})
public class PortfolioController {
	
	
	@Autowired
	private PortfolioService  portfolioService;
 
	@RequestMapping
	public List<Portfolio>  listPortfolios(Model model) {
		return portfolioService.findAll();
	}
	
  	@RequestMapping("/{id}")

	public Portfolio getPortfolioById(@PathVariable("id") Integer id) {
		return portfolioService.findOne(id);
	}

  	@RequestMapping(value="/add" , method = RequestMethod.POST)
	public Portfolio processAddNewPortfolioForm(@RequestBody Portfolio portfolioToBeAdded) {
		portfolioService.save(portfolioToBeAdded);

	   	return null;
 
	}
	
 

}
