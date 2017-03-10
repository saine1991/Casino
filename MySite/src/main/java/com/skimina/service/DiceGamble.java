package com.skimina.service;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.skimina.entity.User;
import com.skimina.model.Dice;

@Repository
public class DiceGamble {
	
	public Dice dice = new Dice();

	public int rollDice() {
		Random random = new Random();
		int numberRolled = random.nextInt(6) + 1;
		return numberRolled;
	}

	public void setDiceEyes() {
		switch (rollDice()) {
		case 1:
			dice.setEyes(Dice.Eyes.ONE);
			break;
		case 2:
			dice.setEyes(Dice.Eyes.TWO);
			break;
		case 3:
			dice.setEyes(Dice.Eyes.THREE);
			break;
		case 4:
			dice.setEyes(Dice.Eyes.FOUR);
			break;
		case 5:
			dice.setEyes(Dice.Eyes.FIVE);
			break;
		case 6:
			dice.setEyes(Dice.Eyes.SIX);
			break;
		default:
			dice.setEyes(Dice.Eyes.ONE);
			break;
		}
	}

	public boolean betHighLow(String bet, int betAmount, User user) {
		if (bet.equals("L") && dice.getEyes().ordinal() + 1 <= 3) {
			user.setCoins(user.getCoins()+betAmount*1.5);
			return true;
		}
		if (bet.equals("H") && dice.getEyes().ordinal() + 1 > 3) {
			user.setCoins(user.getCoins()+betAmount*1.5);
			return true;
		}
		user.setCoins(user.getCoins()-betAmount);
		return false;
	}

	public boolean betNumber(int bet, int betAmount, User user) {
		if (bet == dice.getEyes().ordinal() + 1) {
			user.setCoins(user.getCoins()+betAmount*3);
			return true;
		}
		user.setCoins(user.getCoins()-betAmount);
		return false;
	}
}
