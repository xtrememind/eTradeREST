package edu.mum.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.mum.dao.GenericDao;


/*@SuppressWarnings("unchecked")
@Repository*/
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

	@PersistenceContext
    protected EntityManager entityManager;

    protected Class<T> daoType;

	public void setDaoType(Class<T> type) {
			daoType = type;
	}
   
    @Override
    public void save( T entity ){
    	try {
    		entityManager.persist( entity );
    	}catch(Exception ex)
    	{
    		System.out.println("Exception :"+ex.toString());
    	}
        
     }

    @Override
    public void saveorupdate( T entity ){
    	try {
    		entityManager.merge(entity);
    	}catch(Exception ex)
    	{
    		System.out.println("Exception :"+ex.toString());
    	}
        
     }
    public void delete( T entity ){
        entityManager.remove( entity );
     }

	@Override
	public void delete(Integer id) {
        T entity = findOne( id );
        delete( entity );  
    }

	@Override
	public T findOne( Integer id ){
	    return (T) entityManager.find( daoType, id );
	 }
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(){
		      return entityManager.createQuery( "from " + daoType.getName() )
		       .getResultList();
		   }
	
	@Override
	public T update( T entity ){
	      return entityManager.merge( entity );
	   }

 	@Override
	public List<T> findAll(String s,Object  hint ){
 	    return (List<T>)  entityManager.createQuery("SELECT m FROM Member AS m") 
 	    		.setHint(s,hint).getResultList();
  	}
	

 }