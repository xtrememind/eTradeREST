package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.PortfolioTransaction;
import edu.mum.service.PortfolioTransactionService;

@RestController
@RequestMapping ({"/portfolioTransactions"})
public class PortfolioTransactionController {
	
	
	@Autowired
	private PortfolioTransactionService  portfolioTransactionService;
 
	@RequestMapping
	public List<PortfolioTransaction>  listPortfolioTransactions(Model model) {
		return portfolioTransactionService.findAll();
	}
	
  	@RequestMapping("/{id}")

	public PortfolioTransaction getPortfolioTransactionById(@PathVariable("id") Integer id) {
		return portfolioTransactionService.findOne(id);
	}

  	@RequestMapping(value="/add" , method = RequestMethod.POST)
	public PortfolioTransaction processAddNewPortfolioTransactionForm(@RequestBody PortfolioTransaction portfolioTransactionToBeAdded) {
		portfolioTransactionService.save(portfolioTransactionToBeAdded);

	   	return null;
 
	}
	
 

}
