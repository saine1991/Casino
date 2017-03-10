package com.skimina.model;

import java.util.GregorianCalendar;

public class Person {
	private String firstName, lastName;
	private GregorianCalendar birthDate;

	public Person() {
		
	}

	public Person(String firstName, String lastName, GregorianCalendar birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
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

	public GregorianCalendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return firstName +" "+ lastName +" "+ birthDate.get(birthDate.YEAR)+ "-" + (birthDate.get(birthDate.MONTH) + 1) + "-" + birthDate.get(birthDate.DAY_OF_MONTH)+"\n";
	}

}
