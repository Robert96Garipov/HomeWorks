public class Alphabet4 {
	public static void main(String[] args){
    
	
		String s = args[0];
        int i;
		boolean a;
        a = true;
        
        
		for(i = 1; i < s.length(); i++) {          //Comparing letters
			if(s.charAt(i) < s.charAt(i - 1)) {
				a = false;
				break;
			}
        }
        

		if(a)
			System.out.println("Alphabetical order");
		else
			System.out.println("Not alphabetical order");
	}
}