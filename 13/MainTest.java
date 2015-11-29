public class MainTest {
    public static void main(String[] args){
        
        
        Human a = new Human("Robert");
        Hamster b = new Hamster("Nurik");
        Endlessarray data = new Endlessarray();
        
        
        data.add(a);
        data.add(b);
        
        
        System.out.println(((Human)data.getEndlessarray(0)).getName());
        System.out.println(((Hamster)data.getEndlessarray(1)).getName());
    }
}