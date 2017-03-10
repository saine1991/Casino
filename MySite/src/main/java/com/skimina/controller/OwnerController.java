package com.skimina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skimina.model.Owner;

@Controller
public class OwnerController {

	@Autowired
	private Owner owner;

	@RequestMapping(value = "/owner", method = RequestMethod.GET)
	public String getOwnerInformationPage(Model model) {
		model.addAttribute("ownerFirstName", owner.getFirstName());
		model.addAttribute("ownerLastName", owner.getLastName());
		model.addAttribute("ownerAge", owner.getActualAge());
		model.addAttribute("daysLeft", owner.daysLeftToBirthDay());
		return "owner";
	}
}
