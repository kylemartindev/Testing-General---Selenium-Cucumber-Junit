package ConductQA.Test;
import static org.junit.Assert.*;
import org.junit.Test;


public class blackjacktestmain {

	

	@Test
	public void testBlackJack() {
	
	blackjack black = new blackjack();
	
	assertEquals(10, black.blackjack(10, 22));
	assertEquals(9, black.blackjack(22, 9));
	assertEquals(0, black.blackjack(22, 22));
	assertEquals(10, black.blackjack(10, 7));
	assertEquals(19, black.blackjack(1, 19));
	
	}
	
	
	
}
