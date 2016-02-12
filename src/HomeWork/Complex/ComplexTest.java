package HomeWork.Complex;
import java.util.*;
/**
 * Created by lenar on 22.11.2015.
 */
public class ComplexTest {
    public static void Complexa (int x1, int y1, int x2, int y2) {
        int a = x1+x2;
        int b = y1+y2;
        System.out.print("a+b="+a + "+" + b + "*i");
    }
    public static void Complexv (int x1, int y1, int x2, int y2){
        int v =x1-x2;
        int v2 =y1-y2;
        System.out.println("a-b="+v + "+" + v2 + "*i");
    }
    public static void Complexu (int x1, int y1, int x2, int y2) {
        int u = x1*x2 - y1*y2;
        int u2 = x1*y2+x2*y1;
        System.out.println("a*b="+u + "+ i*" + u2);
    }
    public static void Complexd (int x1, int y1, int x2, int y2) {
        if (x2 * x2 + y2 * y2 != 0) {
            double d = (x1 * x2 + y1 * y2) / (x2 * x2 + y2 * y2);
            double d2 = (x2 * y1 - x1 * y2) / (x2 * x2 + y2 * y2);
            if ((d == 0) && (d2 == 0)) {
                System.out.println("a/b=0");
            } else {
                System.out.println("a/b=" + d + "+" + d2 + "*i");
            }
        } else {
            System.out.print("Error!!!");
        }
    }
    public static void Complexm (int x1, int y1, int x2, int y2){
        double a = Math.sqrt(x1*x1+y1*y1);
        double b = Math.sqrt(x2*x2+y2*y2);
        System.out.println("|a|="+a+"|b|="+b);
    }

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1=");
        int x1=in.nextInt();
        System.out.print("y1=");
        int y1=in.nextInt();
        System.out.print("x2=");
        int x2=in.nextInt();
        System.out.print("y2=");
        int y2=in.nextInt();
        Complexa(x1, y1, x2, y2);
        Complexv(x1, y1, x2, y2);
        Complexu(x1, y1, x2, y2);
        Complexd(x1, y1, x2, y2);
        Complexm(x1, y1, x2, y2);
    }
}
