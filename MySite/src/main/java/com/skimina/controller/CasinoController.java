package com.skimina.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skimina.entity.User;
import com.skimina.service.DiceGamble;
import com.skimina.service.UserService;

@Controller
@WebServlet
public class CasinoController extends HttpServlet {

	@Autowired
	private DiceGamble diceGamble;
	
	@Autowired
	private User user;
	
	@Autowired
	private UserService userService;
	
	public User findCurrentUser() {
		UserDetails object = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		user = userService.findByEmail(object.getUsername());
		return null;
	}

	@RequestMapping(value = "/casino", method = RequestMethod.GET)
	public String getCasinoPage(Model model) {
		findCurrentUser();
		model.addAttribute("email", user.getEmail());
		model.addAttribute("coins", user.getCoins());
		return "casino";
	}

	@RequestMapping(value = "/casino/hl", method = RequestMethod.POST)
	public String playHighLow(HttpServletRequest request, Model model) {
		findCurrentUser();
		diceGamble.setDiceEyes();
		String parameterHL = request.getParameter("bet");
		String parameterAmount = request.getParameter("betamount1");
		int betAmount = Integer.parseInt(parameterAmount);
		boolean win = diceGamble.betHighLow(parameterHL, betAmount, user);
		model.addAttribute("numberRolled", diceGamble.dice.getEyes().ordinal() + 1);
		model.addAttribute("winHL", win);
		model.addAttribute("coins", user.getCoins());
		model.addAttribute("email", user.getEmail());
		
		userService.save(user);
		return "casino";
	}

	@RequestMapping(value = "/casino/number", method = RequestMethod.POST)
	public String playNumber(HttpServletRequest request, Model model) {
		findCurrentUser();
		diceGamble.setDiceEyes();
		String parameterNb = request.getParameter("number");
			int parameterNumber = Integer.parseInt(parameterNb);
			String parameterAmount = request.getParameter("betamount2");
			int betAmount = Integer.parseInt(parameterAmount);
			boolean win = diceGamble.betNumber(parameterNumber, betAmount, user);
			model.addAttribute("numberRolled", diceGamble.dice.getEyes().ordinal() + 1);
			model.addAttribute("winNumber", win);
			model.addAttribute("coins", user.getCoins());
			model.addAttribute("email", user.getEmail());
			
			userService.save(user);
		return "casino";
	}
}
