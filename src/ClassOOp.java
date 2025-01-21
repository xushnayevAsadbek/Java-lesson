class Person {
        String name = "hello";
}
public class ClassOOp {
    static String personPlus(String ism) {
        return ism + " uchun!";
    }
    public static void main(String[] args) {
    String add = personPlus("aaa");
    String bbb = personPlus("fff");
        System.out.println(add);
        System.out.println(bbb);
        Person hello = new Person();
        System.out.println(hello.name);
    }

}
