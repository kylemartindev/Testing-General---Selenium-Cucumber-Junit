package ConductQA.Test;

public class Newspaper extends Items{
	private int NewspaperId;
	private String Name;
	private String Type;

public Newspaper(int NewspaperId, String Name, String Type ) {
	this.NewspaperId = NewspaperId;
	this.Name = Name;
	this.Type = Type;
	
	
}	

public int getNewsPaperID() {
	
	return NewspaperId;
	
	
}

public String setName() {
	return this.Name;
	
}

public String getName() {
	
	return Name;
	
}

public String getType() {
	
	return Type;
	
}
	
}
