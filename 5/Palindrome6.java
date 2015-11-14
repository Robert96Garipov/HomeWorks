public class Palindrome6 {
    public static void main(String[] args) {
        
        
        StringBuilder s = new StringBuilder(args[0]);
        int d = s.length();
        boolean a;
        a = true;
        
        
        for (int i=0; i < d/2; i++) {                     // Checking chars
            if (s.charAt(i) != s.charAt(d - i - 1)) {
              a = false;
              break;
            }
        }
        
        
        if (a) {
         System.out.println("Is a palindrome");   
        }
        else {
            System.out.println("Is not a palindrome");
        }
        
        
    }
}    
            
        