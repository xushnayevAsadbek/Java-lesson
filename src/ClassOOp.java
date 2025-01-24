class Person {
        String name = "Ali";
        int age = 21;
}
class Dastur {
    static  void kirish(){
        System.out.println("Dastur ishga tushdi !!!");
    }
    static void chiqish(){
        System.out.println("Dastur yopildi  !!!");
    }
}
public class ClassOOp {
//    static String personPlus(String ism) {
//        return ism + " uchun!";
//    }
    public static void main(String[] args) {
        Person personObj = new Person();
        System.out.println(personObj.name);
        personObj.age = 25;
        personObj.name = "Aziz";
      System.out.println(personObj.age);
        System.out.println(personObj.name);
    Dastur word = new Dastur();
    word.kirish();
    word.chiqish();
    String add = personPlus("aaa");
    String bbb = personPlus("fff");
        System.out.println(add);
        System.out.println(bbb);
        Person hello = new Person();
        System.out.println(hello.name);
    }

}
