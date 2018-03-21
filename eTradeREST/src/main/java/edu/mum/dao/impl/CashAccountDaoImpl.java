package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.CashAccountDao;
import edu.mum.domain.CashAccount;
import edu.mum.domain.Order;
import edu.mum.domain.User;

@SuppressWarnings("unchecked")
@Repository
public class CashAccountDaoImpl  extends GenericDaoImpl<CashAccount> implements CashAccountDao {
	
	public CashAccountDaoImpl() {
		super.setDaoType(CashAccount.class );
		}

	@Override
	public CashAccount findOnefull(Integer id) {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select u from CashAccount u JOIN FETCH u.client where u.id =:id");
		return (CashAccount) query.setParameter("id", id).getSingleResult();
	}

	@Override
	public List<CashAccount> findfull() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select u from CashAccount u JOIN FETCH u.client ");
		return (List<CashAccount>) query.getResultList();
	}
	
	

}
