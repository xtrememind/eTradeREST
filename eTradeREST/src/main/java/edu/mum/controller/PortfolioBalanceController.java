package edu.mum.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.PortfolioBalance;
import edu.mum.service.PortfolioBalanceService;

@RestController
@RequestMapping({"/portfolioBalances"})
public class PortfolioBalanceController {
	
	@Autowired
	private PortfolioBalanceService  portfolioBalanceService;

	@RequestMapping
	public List<PortfolioBalance>  listPortfolioBalances(Model model) {
		return portfolioBalanceService.findAll();
	}
	
  	@RequestMapping("/{id}")
	public PortfolioBalance getPortfolioBalanceById(@PathVariable("id") Integer id) {
		return portfolioBalanceService.findOne(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public PortfolioBalance processAddNewPortfolioBalanceForm(@RequestBody PortfolioBalance portfolioBalanceToBeAdded) {
			portfolioBalanceService.save(portfolioBalanceToBeAdded);

	   	return null;
 
	}
	
 
}
