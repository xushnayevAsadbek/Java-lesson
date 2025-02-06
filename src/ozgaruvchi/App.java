package ozgaruvchi;

 class Ozgaruvchi {
    static String name = "Anvar";    
    public static void Method1(){
        String name = "Ali";
        System.out.println(name);

    }

    public static void Method2(){
        String name = "Vali";
        System.out.println(name);
    }
        
}
public class App {
    
    public static void main(String[] args) {
        Ozgaruvchi ozgaruvchi = new Ozgaruvchi();
        ozgaruvchi.Method1();
        ozgaruvchi.Method2();
    }
}
