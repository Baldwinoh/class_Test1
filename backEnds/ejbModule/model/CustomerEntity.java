package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "bankCustomer_tbl")

public class CustomerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	private String Name;
	private String s_Passport;
	private String d_Passport;
	private String destinationBank;
	private String destinationCountry;
	private int accountNumber;
	private double amount;
	
	public long getId() {
		
		return id;
	}
	public void setId(long id) {
		
		this.id = id;
	}
	public String getName() {
		
		return Name;
	}
	public void setName(String name) {
		
		Name = name;
	}
	public String getS_Passport() {
		
		return s_Passport;
	}
	public void setS_Passport(String s_Passport) {
		
		this.s_Passport = s_Passport;
	}
	public String getD_Passport() {
		
		return d_Passport;
	}
	public void setD_Passport(String d_Passport) {
		
		this.d_Passport = d_Passport;
	}
	public String getDestinationBank() {
		
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		
		this.destinationCountry = destinationCountry;
	}
	public int getAccountNumber() {
		
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		
		return amount;
	}
	public void setAmount(double amount) {
		
		this.amount = amount;
	}
	
	
	
}
