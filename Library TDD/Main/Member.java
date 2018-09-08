package ConductQA.Test;

public class Member extends Library implements Update{
	private int MemId;
	private String Name;
	private String Location;
	private String Items;
	
	
	public Member (int mem, String name, String location, String Items) {
		this.MemId = mem;
		this.Name = name;
		this.Location = location;
		this.Items = Items;
		
		
		
		
	}
	
	
	public String setName(String name) {
		return null;
		
	}
	
	public String getName() {
		
	return Name;	
		
	}
	
	public String getItem() {
		
		return Items;
		
	}
	
	
	
	
	
	public String output() {
		
		return MemId + Name + Location + Items;
		
	
	}


	public String setName() {
		
		return null;
	}







	
	
	
}
