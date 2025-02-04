package calc;
import java.util.Scanner;
public class Calc<Char> {

    public Calc()   {

    }

    public void Calc() {
        double a , b =0 ;
        String operator;
        Scanner opr = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextDouble();
        System.out.print("b=");
       b = scanner.nextDouble();
       System.out.print("operatorni = "); 
       operator= opr.next();
       char operator_char = operator.charAt(0);
        // operator = scanner.next();

        if (operator_char== '+') {
            System.out.println(a+b);
        } else if (operator_char == '-') {
            System.out.println(a-b);
        } else if (operator_char== '*') {
            System.out.println(a*b);
        } else if (operator_char== '/') {
            System.out.println(a/b);
        } else {
            System.out.println("Bunday operator yo'q");
            
        }
    }
    
}
