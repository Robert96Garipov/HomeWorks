public class Equality4 {
    public static void main(String[] args) {
        double x, y, Result;
        x = Double.parseDouble(args[0]);
        y = Double.parseDouble(args[1]);
        if (x==(29.0666667)) {
            System.out.println("Error");
        }    
        else {
        Result = (x*x*x*x*x*x+y*y*y*y*y*y*y-37)/(4/3+5*x/2-74)+y*y/2-x*y ;
            System.out.println("Result=" + Result);
            }
    }
}    