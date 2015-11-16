import java.util.GregorianCalendar;

public class Product {
    
    
    private String name;
    private int price;
    private final GregorianCalendar bestUntil;
    private final String manufacturer;             
    private final int weight;
    private boolean fresh;
    private boolean sanctions;
    private final GregorianCalendar today = new GregorianCalendar(15, 11, 16);
    
    
    Product (String name, int price, GregorianCalendar bestUntil, String manufacturer, int weight) {
        this.name = name;
        this.price = price;
        this.bestUntil = bestUntil;
        this.manufacturer = manufacturer;
        this.weight = weight;
    
    
    if (bestUntil.after(today)){
        this.fresh = true;            
        }
        else this.fresh = false; 
    
    
    if (this.manufacturer == "Ru" || this.manufacturer == "Kz" || this.manufacturer == "By" || this.manufacturer == "Am" || this.manufacturer == "Kg") {
        this.sanctions = true;
    }
    else this.sanctions = false;
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
    
    
    public GregorianCalendar getBestUntil() {
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
    
    
    public void ToString() {
        System.out.println("Name:         " + name);
        System.out.println("Price:        " + price);
        System.out.println("Best until:   " + bestUntil);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight:       " + price);
        System.out.println("Fresh:        " + fresh);
        System.out.println("Not sanctions:" + sanctions);
        System.out.println();
    }
}    
    