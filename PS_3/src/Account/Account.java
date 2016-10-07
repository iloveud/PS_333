package Account;

import java.util.Date;


import Exception.InsufficientFundException;


import java.io.*;


public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	private double annualInterestRate;
	private double balance;
	private int id;
	
	public Account(){
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		
	}
	
	public Account( int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
	}
	
	private Date dateCreated;
	
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	public void AccountforDateCreated(){
		this.dateCreated = dateCreated;
		
	}
	
	public double getMonthlyInterestRate(){
		return this.annualInterestRate;
		
	}
	
	public void withdraw(double amount) throws InsufficientFundException{
		if(amount <= balance){
	         balance -= amount;
	         
	      }
	      else{
	         double needs = amount - balance;
	         throw new InsufficientFundException(needs);
	         
	      }
	}
	
	public double getBalance(){
	    return balance;
	    
	      
	   }
	public int getNumber(){
	    return id;
	    
	   }
	public double annualInterestRate(){
		return annualInterestRate;
		
	}
	   
	public void deposit(double amount){
		balance += amount;
		
	}

	
	
	
}