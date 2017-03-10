package com.skimina.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skimina.model.Person;
import com.skimina.service.PeopleGenerator;

@Controller
@WebServlet
public class PeopleGeneratorController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private PeopleGenerator peopleGenerator;

	@RequestMapping(value = "/people-generator", method = RequestMethod.GET)
	public String getPeopleGeneratorPage() {
		return "people-generator";
	}

	@RequestMapping(value = "/people-generator/generate/", method = RequestMethod.POST)
	public String generatePeople(HttpServletRequest request, Model model) throws IOException {
		String number = request.getParameter("amount");
		if (number.matches("[0-9]+")) {
		int numb = Integer.parseInt(number);
		List<Person> generatePeople = peopleGenerator.generatePeople(numb);
		model.addAttribute("generatePeople", generatePeople);
		}
		return "people-generator";
	}
}
