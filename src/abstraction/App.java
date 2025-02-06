package abstraction;
 abstract class InnerApp {
 public abstract void Chizmoq ();
 }
 class Aylana extends InnerApp{
    int r ;
    Aylana(int r){
        this.r = r;
    }
    public void Chizmoq(){
        System.out.println(this.r+" ga teng aylanani chizmoq");
 }
}
public class App {
    public static void main(String[] args) {
        System.out.println();
    }
}
