package HomeWork.Task047;
import java.util.*;
/**
 * Created by lenar on 30.11.2015.
 */
public class Taskm24 {
    public static void Summa (double x){
        double s=0;
        double sum;
        for (int i=1; i>0; i++){
            sum = (i*(Math.pow(9,i))*(Math.pow((x-1),2*i)));
            s = 1/sum + s;
        }
        System.out.printf("%.9f",s);
    }
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print ("Input x:");
        double x = in.nextInt();
        Summa(x);
    }
}
