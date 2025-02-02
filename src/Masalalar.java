import java.util.Scanner;
public class Masalalar {
    public static void main(String[] args) {
        int a , b , S , P ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("A=");
        a = scanner.nextInt();
        System.out.print("B=");
        b = scanner.nextInt();
        S= a * b;
        P= 2*(a+b);
        System.out.println("Yuzi" + S);
        System.out.println("Perimetri" + P);
        // System.out.println(  "tomonlarini kiriting:");
    //    int a=5;
    //    int Perimetri ;
    //     Perimetri = scanner.nextInt();
    //     Perimetri = Perimetri * 4;
    //    System.out.println("Perimetr: " + Perimetri);

    }
}
