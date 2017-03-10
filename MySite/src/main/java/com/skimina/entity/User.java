package com.skimina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Repository;

@Entity
@Table(name = "user")
@Repository
public class User {

	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(nullable = false, unique = true)
    @Email
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(name = "coins", nullable = false)
	private double coins;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	public User() {
		this.setCoins(100);
	}

	public User(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.setCoins(100);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getCoins() {
		return coins;
	}

	public void setCoins(double coins) {
		this.coins = coins;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ ", coins=" + coins + ", id=" + id + "]";
	}

}
