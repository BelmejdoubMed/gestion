package com.example.gestion.entity;

import java.util.Objects;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CORPORATE")
public class CorporateCustomer extends Customer {
	private String contactName;
    private double creditLimit;
    private String creditRating;
    
    //------------------------------------------------------------------
    // Constructors
    //------------------------------------------------------------------
    public CorporateCustomer() {
        super();
    }
    public CorporateCustomer(String address, String name, String contactName, double creditLimit, String creditRating) {
        super(address, name);
        this.contactName = contactName;
        this.creditLimit = creditLimit;
        this.creditRating = creditRating;
    }
    
    //------------------------------------------------------------------
    // Overridden methods
    //------------------------------------------------------------------
    @Override
    public String creditRating() {
        return this.creditRating != null ? this.creditRating : "Non évalué";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CorporateCustomer that) || !super.equals(o)) return false;
        return Objects.equals(contactName, that.contactName) && Objects.equals(creditRating, that.creditRating);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contactName, creditRating);
    }
    
    //------------------------------------------------------------------
    // Public methods
    //------------------------------------------------------------------
    public void billForMonth() {
        System.out.println("Facture générée pour: " + getName());
    }
    public void remind() {
        System.out.println("Rappel envoyé à: " + getName());
    }    

    //------------------------------------------------------------------
    // Getters and Setters
    //------------------------------------------------------------------
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    public String getCreditRating() {
        return creditRating;
    }
    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }
}
