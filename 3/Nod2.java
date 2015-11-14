class Nod2 {
 
    public static void main(String[] args){
        Double a, b;
        a = Double.parseDouble(args[0]); 
        b = Double.parseDouble(args[1]); 
        while (a <= 0){
            if (a == 0){
                System.out.print("Error");
            }
        }
        while (b <= 0){
            if (b == 0){
                System.out.print("Error");
            }
        }
        while(a != b){
            if (a > b){
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("NOD= " + b);
    }
}