package ConductQA.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class librarytest {
	
	
	@Test
	public void addBooktest() {
		
		Book b1 = new Book(1,"Java","I.T");
		b1.addbook(b1);
		assertEquals(1,b1.items.size());
		
		
	}
	@Test 
	public void rembook() {
		Book b1 = new Book(1,"Java","I.T");
		b1.removebook(b1);
		assertEquals(0,b1.items.size());
	}
	
	
	@Test
	public void checkoutbook() {
			
			Book b1 = new Book(1,"Java","I.T");
			b1.addbook(b1);
			b1.checkoutbook(1);
			assertEquals(0,b1.items.size());
	}
	
	@Test
	public void checkinbook() {
		Book b1 = new Book(1,"Java","I.T");
		b1.checkinbook(b1);
		assertEquals(1,b1.items.size());
	}
		
	@Test 
	public void addmember() {
		Member m1 = new Member(1,"Claire","Manchester",null);
		m1.addmember(m1);
		assertEquals(1,m1.member.size());
		
	}
		
	@Test
	public void updatemember() {
		Member m1 = new Member(1,"Claire","Manchester",null);
		m1.addmember(m1);
		m1.updatemember(new Member(2,"Alice","Luton",null));
		assertEquals("Alice", m1.member.get(0).getName());
		
		
	}
		
	@Test	
	public void updateItem () {
		Book b1 = new Book(1,"Java","I.T");
		b1.checkinbook(b1);
		b1.updateitem(new Book(1,"Agile","I.T"));
		assertEquals("Agile",b1.items.get(0).getName());
		
		
		
	}	
		
	
		
		
		
		
		
	}
	
	
	


