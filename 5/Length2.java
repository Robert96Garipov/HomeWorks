public class Length2 {
    public static void main(String[] args){
    
    
        String s;
        int i, d;
        
        
        for(i = 0; i < args.length - 1; i++){
            
            for(d = 0; d < args.length - i - 1; d++){
                
                if (args[d].length() > args[d + 1].length()){   //Comparing strings
                    s = args[d];                                //Changing positions
                    args[d] = args[d + 1];
                    args[d + 1] = s;
                }
            }
        }
        
        
        for(i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}