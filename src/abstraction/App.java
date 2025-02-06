package abstraction;
 abstract class InnerApp {
 public abstract void Chizmoq ();
 }
 abstract class Hayvon  {
    public abstract void Ovoz ();    
 }
class It extends Hayvon{
    public void Ovoz(){
        System.out.println("Wow -wow ");
    }
}
 class Aylana extends InnerApp{
    int r ;
    Aylana(int r){
        this.r = r;
    }
    public void Chizmoq(){
        System.out.println(this.r+" sm teng aylanani chizmoq");
 }
}
public class App {
    public static void main(String[] args) {
        Aylana aylana = new Aylana(10);
        aylana.Chizmoq();
        It it = new It();
        it.Ovoz();
    }
}
