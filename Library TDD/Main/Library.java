package ConductQA.Test;

import java.util.ArrayList;

public class Library {
	
	
	


public ArrayList<Member> member = new ArrayList<Member>();

public ArrayList<Items> items = new ArrayList<Items>();  


public void addbook(Items b) {
	
	items.add(b);
	
}
	
public void removebook(Items b) {
	
	
	items.remove(b);
	
	
}	

public void addmember(Member m){
	

	member.add(m);
}
 
public void remmember(Member m) {
	
	member.remove(m);
	
}

public void updatemember(Member m1) {
	
	member.set(0, m1);
	
}

public void updateitem(Items b1) {
	
	items.set(0, b1);
	
}



//public void checkoutbook(String Name) {
		//for (Book book: books) 
	//if  (book.getName().equals(Name)) {
	// books.remove(book);
	
	 //}
	
    	
    //}
	
public void checkoutbook(int ID) {
	
	for (int i = 0; i < items.size(); i++) 

		if (i == ID) {
		 items.remove(i+1);
		
	
	} 
	
	
	
	
	
}



public void checkinbook(Book S) {
	
	
	items.add(S);
	
	
}
}
