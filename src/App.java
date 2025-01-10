//import java.lang.Math;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String davlat = "Ozbekiston!";
                System.out.println(davlat);
        int a=5 ;
        int b = 6 ;
        int natija = Math.max(a , b);
        System.out.println(natija);
         natija = Math.min(a , b);
        System.out.println(natija);
        // sqrt sonning ildizini qaytaradi
        int f= 64 ;
        double ildiz = Math.sqrt(f);
        System.out.println("Ildiz: " + ildiz);
        // random sonlar
        int randomSon = (int) (Math.random()*101);
        System.out.println(randomSon);


    }
}

