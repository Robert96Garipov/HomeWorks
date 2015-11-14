public class Park {
    
    
    private String name;
    private String size;             // Small or big
    private int trees;
    private int guests;
    private final int constantT = 30;
    private final int constantG = 150;
    
    
    Park(String name, String size, int trees, int guests) {
        this.name = name;
        this.size = size;
        this.trees = trees;
        this.guests = guests;
    }
    
    
    public String getName() {
            return this.name;
    }
    public String getSize() {
            return this.size;    
    }
    
    
    public int getTrees() {
            return this.trees; 
    }
    public void setTrees(int trees){
            this.trees = trees;
    }
    public void grownUpTrees() {
            this.trees += constantT;              // Grown up trees
    }
    
    
    public int getGuests() {
            return this.guests;
    }
    public void setGuests(int guests){
            this.guests = guests;
    }
    public void comingGuests() {
            this.guests += constantG;             // Coming guests   
    }  
    
    public void pOut(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Trees: " + trees);
        System.out.println("Guests: " + guests);
    }
} 