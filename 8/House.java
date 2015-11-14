public class House {
    
    
    private String address;
    private int citizen;
    private int flats;
    private int floor;             
    private final int constant = 15;
    
    
    House(String address, int citizen, int flats, int floor) {
        this.address = address;
        this.citizen = citizen;
        this.flats = flats;
        this.floor = floor;
    }
    
    
    public String getAddress() {
            return this.address;
    }
   
   
    public int getCitizen() {
            return this.citizen; 
    } 
    public void setCitizen(int citizen){
            this.citizen = citizen;
    } 
    public void newCitizen(){
            this.citizen += constant;
    }
    
    
    public int getFlats() {
            return this.flats; 
    } 
    public void setFlats(int flats){
            this.flats = flats;
    } 

    
    public int getFloor() {
            return this.floor; 
    } 
    public void setFloor(int floor){
            this.floor = floor;
    } 
    
    public void hOut(){
        System.out.println("Address: " + address);
        System.out.println("Citizen: " + citizen);
        System.out.println("Flats: " + flats);
        System.out.println("Floor: " + floor);
    }    
}    
    