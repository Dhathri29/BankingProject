package com.dhathri.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mytransactions")
public class User{
	
	
	@Id
	public int id;
	public  int transactionamount;
	public int balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTransactionamount() {
		return transactionamount;
	}
	public void setTransactionamount(int transactionamount) {
		this.transactionamount = transactionamount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", transactionamount=" + transactionamount + ", balance=" + balance + "]";
	}
	
	public User(int transactionamount, int balance) {
		super();
		this.transactionamount = transactionamount;
		this.balance = balance;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}