public class Product {
    
    
    private String name;
    private int price;
    private final String bestUntil;
    private final String manufacturer;             
    private final int weight;
    private boolean fresh;
    private boolean sanctions;
    
    
    Product (String name, int price, String bestUntil, String manufacturer, int weight) {
        this.name = name;
        this.price = price;
        this.bestUntil = bestUntil;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
    
    
    public boolean equals (Product x) {
        if (this.name != x.getName()){
            return false;
        }
        if (this.price != x.getPrice()){
            return false;
        }
        if (this.bestUntil != x.getBestUntil()){
            return false;
        }
        if (this.manufacturer != x.getManufacturer()){
            return false;
        }
        if (this.weight != x.getWeight()){
            return false;
        }
        if (this.fresh != x.getFresh()){
            return false;
        }
        if (this.sanctions != x.getSanctions()){
            return false;
        }
        return true;
    }
    
    
    public String getName() {
            return this.name; 
    } 
    public void setName (String name){
            this.name = name;
    } 
    
    
    public int getPrice() {
            return this.price; 
    } 
    public void setPrice (int price){
            this.price = price;
    } 
    
    
    public String getBestUntil() {
            return this.bestUntil; 
    } 
    
    public String getManufacturer() {
            return this.manufacturer; 
    } 
    
    public int getWeight() {
            return this.weight; 
    } 
    
    
    public boolean getFresh() {
            return this.fresh; 
    } 
    public void setFresh (boolean fresh){
            this.fresh = fresh;
    } 
    
    
    public boolean getSanctions() {
            return this.sanctions; 
    } 
    public void setSanctions (boolean sanctions){
            this.sanctions = sanctions;
    } 
    
    
    public void tostring() {
        System.out.println("Name:         " + name);
        System.out.println("Price:        " + price);
        System.out.println("Best until:   " + bestUntil);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight:       " + price);
        System.out.println("Fresh:        " + fresh);
        System.out.println("Not sanctions:" + sanctions);
    }
}    
    