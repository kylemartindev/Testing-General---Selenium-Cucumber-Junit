package ConductQA.Test;
import static org.junit.Assert.*;
import org.junit.Test;
public class uniquetest {
	
	
	@Test
	
	public void testunique() {
		
		Unique test = new Unique();
		
		assertEquals(10, test.uniquesum(3, 4, 3));
		assertEquals(15, test.uniquesum(3, 4, 8));
		assertEquals(0, test.uniquesum(4, 4, 4));
		
	}
	
	
	
	

}
