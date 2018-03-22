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

@Entity
@Table(name = "ORDERS")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id", scope=Order.class)
public class Order implements java.io.Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
	private Integer id;

	@Column(name = "DATE", nullable= false)
	private Date date;
	
	@Column(name = "QUANTITY", nullable= false)
	private int quantity;
	
	@Column(name = "PRICE", nullable= false)
	private double price;
	
	@Column(name = "BUYER_BROKER_FEES", nullable= false)
	private double buyerBrokerFees;
	
	@Column(name = "BUYER_MARKET_FEES", nullable= false)
	private double buyerMarketFees;
	
	@Column(name = "BUYER_ORDER_AMOUNT", nullable= false)
	private double buyerOrderAmount;
	
	@Column(name = "SELLER_BROKER_FEES", nullable= false)
	private double sellerBrokerFees;
	
	@Column(name = "SELLER_MARKET_FEES", nullable= false)
	private double sellerMarketFees;
	
	@Column(name = "SELLER_ORDER_AMOUNT", nullable= false)
	private double sellerOrderAmount;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="BUYER_CLINET_ID")
	private Client buyerClient;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="SELLER_CLINET_ID")
	private Client sellerClient;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="STOCK_ID")
	private Stock stock;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;

	public Order() {
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getBuyerBrokerFees() {
		return buyerBrokerFees;
	}

	public void setBuyerBrokerFees(double buyerBrokerFees) {
		this.buyerBrokerFees = buyerBrokerFees;
	}

	public double getBuyerMarketFees() {
		return buyerMarketFees;
	}

	public void setBuyerMarketFees(double buyerMarketFees) {
		this.buyerMarketFees = buyerMarketFees;
	}

	public double getBuyerOrderAmount() {
		return buyerOrderAmount;
	}

	public void setBuyerOrderAmount(double buyerOrderAmount) {
		this.buyerOrderAmount = buyerOrderAmount;
	}

	public double getSellerBrokerFees() {
		return sellerBrokerFees;
	}

	public void setSellerBrokerFees(double sellerBrokerFees) {
		this.sellerBrokerFees = sellerBrokerFees;
	}

	public double getSellerMarketFees() {
		return sellerMarketFees;
	}

	public void setSellerMarketFees(double sellerMarketFees) {
		this.sellerMarketFees = sellerMarketFees;
	}

	public double getSellerOrderAmount() {
		return sellerOrderAmount;
	}

	public void setSellerOrderAmount(double sellerOrderAmount) {
		this.sellerOrderAmount = sellerOrderAmount;
	}

	public Client getBuyerClient() {
		return buyerClient;
	}

	public void setBuyerClient(Client buyerClient) {
		this.buyerClient = buyerClient;
	}

	public Client getSellerClient() {
		return sellerClient;
	}

	public void setSellerClient(Client sellerClient) {
		this.sellerClient = sellerClient;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
