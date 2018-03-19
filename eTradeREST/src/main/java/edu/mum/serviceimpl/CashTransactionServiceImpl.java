package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.dao.CashTransactionDao;
import edu.mum.domain.CashTransaction;

@Service
@Transactional 
public class CashTransactionServiceImpl implements edu.mum.service.CashTransactionService {
	
	@Autowired
	private CashTransactionDao cashTransactionDao;

	@Override
	public void save(CashTransaction cashTransaction) {
		// TODO Auto-generated method stub
		cashTransactionDao.save(cashTransaction);
		
		
	}

	@Override
	public List<CashTransaction> findAll() {
		// TODO Auto-generated method stub
		return cashTransactionDao.findAll();
	}

	@Override
	public CashTransaction findOne(Long id) {
		// TODO Auto-generated method stub
		return cashTransactionDao.findOne(id);
	}

	@Override
	public CashTransaction update(CashTransaction cashTransaction) {
		// TODO Auto-generated method stub
		return cashTransactionDao.update(cashTransaction);
	}

}
