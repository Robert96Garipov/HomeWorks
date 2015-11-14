public class EquationString1 {
    public static void main(String[] args) {
        String s = new String("");
        String aa = new String("");
        String bb = new String("");
        String cc = new String("");
        s = args[0];
        
        
        int i, j;
        double  x1, x2, a, b, c, D;
        D = 0;
        x1 = 0;
        x2 = 0;
        j = 0;
        
        for(i = 0; i < s.length(); i++){                   // Reading the number "a"
             j=i;
			if (s.charAt(i) != 'x') {
             bb = bb + s.charAt(i);
             }  
            else break; 
        }    
        
        
        for(i = j+3; i < s.length(); i++){                 // Reading the number "b"
             j=i;
			if (s.charAt(i) != 'x') {
             aa = aa + s.charAt(i);
             }  
            else break; 
        }    
        
        
        for(i = j+1; i < s.length(); i++){                 // Reading the number "c"
             cc = cc + s.charAt(i);
             }     
        
        
        a = Double.valueOf(aa.toString());
    	b = Double.valueOf(bb.toString());
    	c = Double.valueOf(cc.toString());
        
        
        D = (b * b - 4 * a * c);
        if (D > 0) {
        x1 = (-b + Math.sqrt(D)) / (2*a); 
        x2 = (-b - Math.sqrt(D)) / (2*a);
        System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } 
        else if (D == 0){
        x1 = (-b) / (2*a);
        System.out.println("x = " + x1); 
        } 
        else {
        System.out.println("No roots"); 
        }
        }
}