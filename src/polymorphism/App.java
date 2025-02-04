package polymorphism;

 class Transport {
   public void harakatlanish(){
    System.out.println("Transport harakatlanmoqda");
   }        
}
class Mashina extends Transport {
    public void harakatlanish(){
        System.out.println("Mashina harakatlanmoqda");
    }
}
class Samalyot extends Transport{
    public void harakatlanish(){
        System.out.println("Smalyot harakatlanmoqda");
    }
}
public class App {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.harakatlanish();
        Mashina mashina = new Mashina();
        mashina.harakatlanish();
        Samalyot samalyot = new Samalyot();
        samalyot.harakatlanish();

    }   
}
