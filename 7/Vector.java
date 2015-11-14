public class Vector {
        
	private double x;
	private double y;
	private double z;
	
    public double getX(){
		return x;
	}
    
	public double getY(){
		return y;
	}
    
	public double getZ(){
		return z;
	}
    
	public void setX (double x){
		this.x = x;
	}
    
	public void setY (double y){
		this.y = y;
	}
    
	public void setZ (double z){
		this.z = z;
	}
    
	public double getModule(){
		return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
	}
    
	public void addition (double x2, double y2, double z2){
		System.out.println("x= " + (this.x + x2));
		System.out.println("y= " + (this.y + y2));
		System.out.println("z= " + (this.z + z2));
	}
    
	public void subtraction (double x2, double y2, double z2){
		System.out.println("x= " + (this.x - x2));
		System.out.println("y= " + (this.y - y2));
		System.out.println("z= " + (this.z - z2));
	}
    
	public void multiplication (double x2, double y2, double z2){
		double x1 = this.y * z2 - this.z * y2;
		double y1 = this.z * x2 - this.x * z2;
		double z1 = this.x * y2 - this.y * x2;
		System.out.println("x= " + x1);
		System.out.println("y= " + y1);
		System.out.println("z= " + z1);
	}
    
	public double scalar (double x2, double y2, double z2){
		double corner = (this.x * x2 + this.y * y2 + this.z * z2) / (Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z) 
        * Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2));
		return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z) * Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2) * Math.cos(corner);
	}
    
	public static void main (String[] args){
        
		Vector a = new Vector();
        Vector b = new Vector();
       
		a.setX(3);
		a.setY(5);
		a.setZ(7); 
		b.setX(2);
		b.setY(4);
		b.setZ(6);
        
		System.out.println("Module a = " + a.getModule());
		System.out.println("Module b = " + b.getModule());
		System.out.println("Addition = "); a.addition(b.getX(), b.getY(), b.getZ());
		System.out.println("Subtraction = "); b.subtraction(a.getX(), a.getY(), a.getZ());
		System.out.println("Multiplication = "); a.multiplication(b.getX(), b.getY(), b.getZ());
		System.out.println("Scalar = " + a.scalar(b.getX(), b.getY(), b.getZ()));
	}
}
		

