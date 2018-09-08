package ConductQA.Test;

public class toohot {
	
	public String toohott(int a, boolean IsSummer) {
		if (a<60 && a>90 && IsSummer) {
			return "Its not too hot";
			
		}
		if (a>90 && IsSummer)	{
			
			return "Its very hot";
		}
		return "Its not too hot";
		
	}


	
	
}
