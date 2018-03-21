package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CashAccountDao;
import edu.mum.domain.CashAccount;
import edu.mum.service.CashAccountService;


@Service
@Transactional
public class CashAccountServiceImpl implements CashAccountService {
	
	@Autowired
	private CashAccountDao cashAccountDao;

	@Override
	public void save(CashAccount cashAccount) {
		// TODO Auto-generated method stub
		cashAccountDao.save(cashAccount);
		
	}

	@Override
	public List<CashAccount> findAll() {
		// TODO Auto-generated method stub
		return cashAccountDao.findAll();
	}

	@Override
	public CashAccount findOne(Integer id) {
		// TODO Auto-generated method stub
		return cashAccountDao.findOne(id);
	}

	@Override
	public CashAccount update(CashAccount cashAccount) {
		// TODO Auto-generated method stub
		return cashAccountDao.update(cashAccount);
	}

	@Override
	public CashAccount findOnefull(Integer id) {
		// TODO Auto-generated method stub
		return cashAccountDao.findOnefull(id);
	}

	@Override
	public List<CashAccount>  findfull() {
		// TODO Auto-generated method stub
		return cashAccountDao.findfull();
	}
	

}
