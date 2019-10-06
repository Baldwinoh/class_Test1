package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.CustomerEntity;


@Stateless
@LocalBean
public class CustomerEjb {

   @PersistenceContext
   private EntityManager em;
   
    public CustomerEjb() {
        
    }

     public void addNewCustomer(CustomerEntity custEntity )
     {
    	 em.persist(custEntity);
    	 
     }
}
