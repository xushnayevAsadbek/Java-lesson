class Dastur1 {
    String dasturNomi;
    Dastur1(String dasturNomi){
        this.dasturNomi = dasturNomi;
    }
    static  void kirish(){
        System.out.println("Dastur ishga tushdi !!!");
    }
    static void chiqish(){
        System.out.println("Dastur yopildi  !!!");
    }
}
public class Construktor {
    public static void main(String[] args) {
        Dastur1 Telegram = new Dastur1("Telegram");
        Dastur1 Word = new Dastur1("Word");
        System.out.println(Telegram.dasturNomi);
        System.out.println(Word.dasturNomi);
    }
}
