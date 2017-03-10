package com.skimina.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import com.skimina.files.FileRefactorer;
import com.skimina.model.Person;

@Repository
public class PeopleGenerator {
	FileRefactorer file = new FileRefactorer();
	String pathLastNames = file.refactoredLastNameFile;
	String pathFirstNames = file.refactoredFirstNameFile;
	
	public List<String> generateLastNamesList() throws IOException {
		
		InputStreamReader isReader = new InputStreamReader(this.getClass().getResourceAsStream(pathLastNames));
		BufferedReader frLastNames = new BufferedReader(isReader);
		Scanner scan = new Scanner(frLastNames);

		List<String> lastNames = new ArrayList<>();
		while (scan.hasNextLine())
			lastNames.add(scan.nextLine());
		scan.close();
		return lastNames;
	}

	public List<String> generateFirstNamesList() throws IOException {
		InputStreamReader isReader = new InputStreamReader(this.getClass().getResourceAsStream(pathFirstNames));
		BufferedReader frFirstNames = new BufferedReader(isReader);
		Scanner scan = new Scanner(frFirstNames);
		List<String> firstNames = new ArrayList<>();

		while (scan.hasNextLine())
			firstNames.add(scan.nextLine());
		scan.close();
		return firstNames;
	}

	public GregorianCalendar randomDateOfBirth(){
		Random random = new Random();
		GregorianCalendar gc = new GregorianCalendar();
		int year = random.nextInt(62)+1939;
		int day = random.nextInt(gc.getActualMaximum(gc.DAY_OF_YEAR))+1;
		gc.set(gc.YEAR, year);
		gc.set(gc.DAY_OF_YEAR, day);
		return gc;
	}
	
	public List<Person> generatePeople(int amount) throws IOException{
		List<String> names = generateFirstNamesList();
		List<String> lastNames = generateLastNamesList();
		Random random = new Random();
		List<Person> people = new ArrayList<>();

		for (int i = 1; i <= amount; i++) {
			Person person = new Person();
			person.setFirstName(names.get(random.nextInt(names.size() - 1)));
			person.setLastName(lastNames.get(random.nextInt(lastNames.size() - 1)));
			if (person.getFirstName().endsWith("a") && person.getLastName().endsWith("i")){
				String lastName = person.getLastName();
				lastName = lastName.substring(0, lastName.length()-1);
				lastName = lastName + "a";
				person.setLastName(lastName);
			}
			person.setBirthDate(randomDateOfBirth());
			people.add(person);
		}
		return people;
	}
}
