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

import edu.mum.domain.Stock;
import edu.mum.service.StockService;

@RestController
@RequestMapping({"/stocks"})
public class StockController {
	
	@Autowired
	private StockService  stockService;

	@RequestMapping
	public List<Stock>  listStocks(Model model) {
		return stockService.findAll();
	}
	
  	@RequestMapping("/{id}")
	public Stock getStockById(@PathVariable("id") Long id) {
		return stockService.findOne(id);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Stock processAddNewStockForm(@RequestBody Stock stockToBeAdded) {
			stockService.save(stockToBeAdded);

	   	return null;
 
	}
	
 
}
