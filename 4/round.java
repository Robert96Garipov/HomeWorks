class round{
	public static void main(String[] args){
		int rad = Integer.valueOf(args[0]);
		int X1 = rad;
		int Y1 = rad;
		for(int x = 1; x < 2*rad; x++)
		{
			for(int y = 1; y < 2*rad; y++)
			{
				double d = Math.sqrt((x - X1) * (x - X1) + (y - Y1) * (y - Y1));
				if(d > rad)
					System.out.print("0 ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}