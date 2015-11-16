import java.util.GregorianCalendar;

public class Main {
    public static void main(String args[]) {
       
        GregorianCalendar pizzaData = new GregorianCalendar(15, 11, 18);
        Product pizza = new Product ("Pizza",435,pizzaData,"It", 1100);
        pizza.ToString();
        
        GregorianCalendar spaghettiData = new GregorianCalendar(15, 10, 01);
        Product spaghetti = new Product ("Spaghetti",87,spaghettiData,"It", 500);
        spaghetti.ToString();
        
        GregorianCalendar kumysData = new GregorianCalendar(16, 01, 12);
        Product kumys = new Product ("Kumys",100,kumysData,"Kz", 250);
        kumys.ToString();
    } 
}    