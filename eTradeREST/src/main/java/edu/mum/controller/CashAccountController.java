package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.domain.CashAccount;
import edu.mum.domain.User;
import edu.mum.service.CashAccountService;

@RestController
@RequestMapping({"/cashAccounts"})
public class CashAccountController {
	

	@Autowired
	private CashAccountService  cashAccountService;
	
	
	@RequestMapping
	public List<CashAccount>  listCashAccount(Model model) {
		return cashAccountService.findAll();
	}
	
  	@RequestMapping("/{id}")
	public CashAccount getcashAccountById(@PathVariable("id") Integer id) {
		return cashAccountService.findOne(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public CashAccount processAddNewCashAccountForm(@RequestBody CashAccount cashAccountToBeAdded) {
		cashAccountService.save(cashAccountToBeAdded);

	   	return null;
 
	}
	
 

}
