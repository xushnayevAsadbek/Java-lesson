class Dastur1 {
    String dasturNomi;
    Dastur1(String dasturNomi){
        this.dasturNomi = dasturNomi;
    }
    void getDastur(){
        System.out.println(this.dasturNomi);
    }
    void  setDastur(String dasturNomi){
        this.dasturNomi = dasturNomi;
        System.out.println("Dastur nomi o'zgartirildi ");
    }
      void kirish(){
        System.out.println("Dastur ishga tushdi !!!");
    }
     void chiqish(){
        System.out.println("Dastur yopildi  !!!");
    }
}
public class Construktor {
    public static void main(String[] args) {
        Dastur1 dastur1 = new Dastur1("Telegram");
        dastur1.getDastur();
        dastur1.setDastur("Instagram");
        dastur1.getDastur();
    }
}
