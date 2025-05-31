package com.example.gestion.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PERSONAL")
public class PersonalCustomer extends Customer {

    private long creditCard;
    
    //-------------------------------------------------------------------
    //	Constructors
    //-------------------------------------------------------------------
    public PersonalCustomer() {
        super();
    }
    public PersonalCustomer(String address, String name, long creditCard) {
        super(address, name);
        this.creditCard = creditCard;
    }
    
    //-------------------------------------------------------------------
    //	Overridden methods
    //-------------------------------------------------------------------
    @Override
    public String creditRating() {
        return String.valueOf(creditCard).length() == 16 ? "A" : "B";
    }
	
    /* @Override public boolean equals(Object o) { if (this == o) return true; if
	 * (!(o instanceof PersonalCustomer that) || !super.equals(o)) return false;
	 * return creditCard == that.creditCard; }
	 * 
	 * @Override public int hashCode() { return Objects.hash(super.hashCode(),
	 * creditCard); } */
    
    //-------------------------------------------------------------------
    //	Getters and Setters
    //-------------------------------------------------------------------    
    public long getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }
}