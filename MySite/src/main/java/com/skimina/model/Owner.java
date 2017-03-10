package com.skimina.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Repository;

//Informations about the site owner
@Repository
public class Owner {
	private final String firstName = "Adam";
	private final String lastName = "Skimina";
	private final int bornYear = 1991;
	private final int bornMonth = 8;
	private final int bornDay = 7;

	private int age;

	public Owner() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getActualAge() {
		Calendar calendar = new GregorianCalendar();
		return calendar.get(Calendar.YEAR) - bornYear;
	}

	public int daysLeftToBirthDay() {
		Calendar calendar = new GregorianCalendar();
		int actualDayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		calendar = new GregorianCalendar(calendar.get(Calendar.YEAR), bornMonth-1, bornDay);
		int dayOfBirthDay = calendar.get(Calendar.DAY_OF_YEAR);

		if (actualDayOfYear <= dayOfBirthDay)
			return dayOfBirthDay - actualDayOfYear;
		else {
			return calendar.getActualMaximum(Calendar.DAY_OF_YEAR) - actualDayOfYear
					+ (new GregorianCalendar(calendar.get(Calendar.YEAR) + 1, bornMonth-1, bornDay))
							.get(Calendar.DAY_OF_YEAR);
		}
	}
}
