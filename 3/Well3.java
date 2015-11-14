class Well3 {
    public static void main(String[] args){
        double s, g, t;
        g = 9.81;    
            t = Double.parseDouble(args[0]);
            if (t <=0){
                System.out.println("Error: time<=0");
            }
        s = g * t * t / 2.0;                                                                    
        System.out.println(s);    
    }
}    