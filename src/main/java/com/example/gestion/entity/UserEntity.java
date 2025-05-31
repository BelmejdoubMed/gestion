package com.example.gestion.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private String username;
    private String password;
    private boolean enabled = true;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "authorities", joinColumns = @JoinColumn(name = "username"))
    @Column(name = "authority")
    private Set<String> authorities = new HashSet<>();
    
    @Override
	public String toString() {
		return "UserEntity [username=" + username + ", password=" + password + ", enabled=" + enabled + ", authorities="
				+ authorities + "]";
	}
    
    //----------------------------------------------------------------------
    // Constructors
    //----------------------------------------------------------------------
	public UserEntity(String username, String password, boolean enabled, Set<String> authorities) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.authorities = authorities;
	}
	public UserEntity() {
		super();
	}
	
	//----------------------------------------------------------------------
    // Getters and Setters
    //----------------------------------------------------------------------
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Set<String> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(Set<String> authorities) {
		this.authorities = authorities;
	}

 }