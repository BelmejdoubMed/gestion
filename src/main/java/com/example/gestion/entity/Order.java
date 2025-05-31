package com.example.gestion.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "customer_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateReceived;
    private boolean isPrepaid;
    private String number;
    private int price;
    private boolean closed = false;
    private boolean dispatched = false;

    //-------------------------------------------------------------------
    // Relationships
    //-------------------------------------------------------------------
    @ManyToOne
    @JsonIgnore   // Prevents circular references in JSON serialization
    private Customer customer;

    //-------------------------------------------------------------------
    // Methods
    //-------------------------------------------------------------------
    public void close() { this.closed = true; }
    public void dispatch() { this.dispatched = true; }
    
    //-------------------------------------------------------------------
    // Constructors
    //-------------------------------------------------------------------
    public Order() { }
    public Order(Date dateReceived, boolean isPrepaid, String number, int price, Customer customer) {
		this.dateReceived = dateReceived;
		this.isPrepaid = isPrepaid;
		this.number = number;
		this.price = price;
		this.customer = customer;
	}
	
    //-------------------------------------------------------------------
    // Getters and Setters
    //-------------------------------------------------------------------
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}
	public boolean isPrepaid() {
		return isPrepaid;
	}
	public void setPrepaid(boolean isPrepaid) {
		this.isPrepaid = isPrepaid;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isClosed() {
		return closed;
	}
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
	public boolean isDispatched() {
		return dispatched;
	}
	public void setDispatched(boolean dispatched) {
		this.dispatched = dispatched;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}