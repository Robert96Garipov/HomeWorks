public class Main {
  public static void main(String args[]) {
      
        Park park = new Park ("Gagarin's" , "Small" , 550, 200);
        House house = new House ("Lenin Street, 3" , 45 , 16, 5);
        
        
        System.out.println("Park 2014:");
        park.pOut();
        
        System.out.println();
        
        System.out.println("House 2014:");
        house.hOut();
        
        System.out.println();
        
        
        park.comingGuests();
        park.grownUpTrees();
        house.newCitizen();
        
        
        System.out.println("Park 2015:");
        park.pOut();
        
        System.out.println();
        
        System.out.println("House 2015:");
        house.hOut();
  }
}  
  