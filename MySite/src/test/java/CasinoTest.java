import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.skimina.entity.User;
import com.skimina.service.DiceGamble;

public class CasinoTest {

	DiceGamble dg = new DiceGamble();
	
	User user = new User();

	@Test
	public void testBetHighLow() {
		dg.setDiceEyes();
		if (dg.dice.getEyes().ordinal() + 1 > 3) {
			assertEquals(true, dg.betHighLow("H", 0, user));
		} else if(dg.dice.getEyes().ordinal() + 1 <= 3){
			assertEquals(false, dg.betHighLow("H", 0, user));
		}
	}

	@Test
	public void testBetNumber() {
		dg.setDiceEyes();
		if (dg.dice.getEyes().ordinal()+1 == 1) {
			assertEquals(true, dg.betNumber(1, 0, user));
		}
		else {
			assertEquals(false, dg.betNumber(1, 0, user));
		}
		if (dg.dice.getEyes().ordinal()+1 == 2) {
			assertEquals(true, dg.betNumber(2, 0, user));
		}
		else {
			assertEquals(false, dg.betNumber(2, 0, user));
		}
		if (dg.dice.getEyes().ordinal()+1 == 3) {
			assertEquals(true, dg.betNumber(3, 0, user));
		}
		else {
			assertEquals(false, dg.betNumber(3, 0, user));
		}
		
		if (dg.dice.getEyes().ordinal()+1 == 4) {
			assertEquals(true, dg.betNumber(4, 0, user));
		}
		else {
			assertEquals(false, dg.betNumber(4, 0, user));
		}
		if (dg.dice.getEyes().ordinal()+1 == 5) {
			assertEquals(true, dg.betNumber(5, 0, user));
		}
		else {
			assertEquals(false, dg.betNumber(5, 0, user));
		}
		if (dg.dice.getEyes().ordinal()+1 == 6) {
			assertEquals(true, dg.betNumber(6, 0, user));
		}
		else {
			assertEquals(false, dg.betNumber(6, 0, user));
		}
	}
}
