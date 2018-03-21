package edu.mum.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@Entity
@Table(name = "CASH_TRANSACTIONS")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CashTransaction implements java.io.Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
	private Integer id;
	
	@Column(name = "DATE", nullable= false)
	private Date date;
	
	@Column(name = "AMOUNT", nullable= false)
	private Double amount;
	
	@Column(name = "BALANCE", nullable= false)
	private double balance;
	
	@Column(name = "DESCRIPTION", nullable= false)
	private String description;
	
    @ManyToOne(fetch=FetchType.EAGER )
    @JoinColumn(name="CASH_ACCOUNT_ID")
	private CashAccount cashAccount;


	public CashTransaction() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public CashAccount getCashAccount() {
		return cashAccount;
	}


	public void setCashAccount(CashAccount cashAccount) {
		this.cashAccount = cashAccount;
	}
	
}
