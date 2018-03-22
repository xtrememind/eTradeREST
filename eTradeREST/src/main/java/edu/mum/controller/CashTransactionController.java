package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.CashTransaction;

import edu.mum.service.CashTransactionService;

@RestController
@RequestMapping({"/cashTransactions"})
public class CashTransactionController {
	
	@Autowired
	private CashTransactionService  cashTransactionService;
	
	@RequestMapping
	public List<CashTransaction>  listCashTransactions(Model model) {
		return cashTransactionService.findAll();
	}
	
  	@RequestMapping("/{id}")
	public CashTransaction getCashTransactionById(@PathVariable("id") Integer id) {
		return cashTransactionService.findOne(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public CashTransaction processAddNewCashTransactionForm(@RequestBody CashTransaction cashTransactionToBeAdded) {
		
		cashTransactionService.save(cashTransactionToBeAdded);

	   	return null;
 
	}
	
	

}
