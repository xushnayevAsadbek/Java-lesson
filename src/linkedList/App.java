package linkedList;
import java.util.LinkedList;
public class App {
    public static void main(String[] args) {
       LinkedList <String> cars = new LinkedList<String>() ;
       cars.add("BMW");
       cars.add("Matiz");
       cars.add("Nexia");
    //    System.out.println(cars);
         cars.addFirst("Audi");
         System.out.println(cars);
         
            System.out.println(cars.size());
    }
}
