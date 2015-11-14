class PointInCircle1 {
    public static void main(String[] args){
        double x0, y0, x, y, d, r;
        x0 = Double.parseDouble(args[0]); 
        y0 = Double.parseDouble(args[1]); 
        r  = Double.parseDouble(args[2]);  
        x  = Double.parseDouble(args[3]);                   
        y  = Double.parseDouble(args[4]);  
        if (r<=0) {
            System.out.println("Error: Radius=0");    
        }    
		d = Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));       
        if (r < d) {
			System.out.println("Point out circle");
		} 
        else {
			if (r > d) {
				System.out.println("Point in circle");
			} else {
				System.out.println("Point on circle");
			}
		}
    }
}