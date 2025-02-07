package arraylist;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<String> uyHayvonlari = new ArrayList<String>();
        System.out.println(uyHayvonlari);
        uyHayvonlari.add("It");
        uyHayvonlari.add("ot");
        uyHayvonlari.add("mushuk");
        uyHayvonlari.add("sigir");
        uyHayvonlari.add("qoy");
        System.out.println(uyHayvonlari);
        for (int i = 0; i < uyHayvonlari.size() ; i++) {
            System.out.println(uyHayvonlari.get(i)); 
        }
        System.out.println("For each loop ========");
        for (String uyHayvon : uyHayvonlari) {
            System.out.println(uyHayvon);
        }
    }
}
