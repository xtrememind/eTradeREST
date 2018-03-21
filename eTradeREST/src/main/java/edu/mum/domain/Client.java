package edu.mum.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "CLIENTS")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Client implements java.io.Serializable {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
	private Integer id;
    
    @Column(name = "NAME", nullable = false)
	private String name;
    
    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="client")
	private Portfolio portfolio;
 
	@OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="client")
	private CashAccount cashAccount;

	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CLIENT_ID") 
	private UserCredentials userCredentials;
	
	
	public Client() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(CashAccount cashAccount) {
		this.cashAccount = cashAccount;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

}
