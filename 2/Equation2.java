public class Equation2 {
    public static void main(String[] args) {
        double  x1, x2, a, b, c, D;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        D = 0;
        x1 = 0;
        x2 = 0;
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