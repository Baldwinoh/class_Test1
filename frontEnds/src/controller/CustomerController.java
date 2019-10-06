package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Customer;
import service.CustomerEjb;

@ManagedBean(name = "customercontroller")
@SessionScoped

public class CustomerController {
	
	@EJB
	CustomerEjb custservice;
	
	@ManagedProperty(value="#{customer}")
	private Customer customer;

	
	public void addNewCustomers()
	{
		custservice.addNewCustomer(customer.getEntity());
		
	}


	public Customer getCustomer() {
		
		return customer;
	}


	public void setCustomer(Customer customer) {
		
		this.customer = customer;
	}
	
	
	
}
