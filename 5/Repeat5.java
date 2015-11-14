public class Repeat5 {
	public static void main(String[] args){
    
	
		String s = args[0];
        boolean a;
        a = false;
        int b;
        b=0;
        
        
        for (int i=0; i < s.length(); i++) {              // Checking chars
            for (int d = 1; d < s.length(); d++) { 
                if (s.charAt(i) == s.charAt(d)) {
                    a = true;
                    b = Integer.valueOf(s.charAt(i));
                    break;
                }
            }
        }


        if (a) {
            System.out.println(b);
        }
        else {
           System.out.println("No repeats"); 
        }
    }
}    
        