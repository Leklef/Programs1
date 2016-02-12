package HomeWork.Task047;
import java.util.*;
/**
 * Created by lenar on 30.11.2015.
 */
public class Taskm33 {
    public static void SummaV(int []a, int []b, int n) {
        long sqp=0, sqrta=0, sqrtb=0;
        for (int q=0; q<=n-1; q++) {
            int p=a[q]*b[q];
            sqp=sqp+p;
            sqrta=sqrta+a[q]*a[q];
            sqrtb=sqrtb+b[q]*b[q];
        }
        System.out.println("sqp="+sqp);
    }
    public static void Cos(int []a, int []b, int n){
        double cos=0;
        long sqp=0, sqrta=0, sqrtb=0;
        for (int q=0; q<=n-1; q++) {
            int p=a[q]*b[q];
            sqp=sqp+p;
            sqrta=sqrta+a[q]*a[q];
            sqrtb=sqrtb+b[q]*b[q];
        }
        cos=sqp/((Math.sqrt(sqrta))*(Math.sqrt(sqrtb)));
        System.out.println("cos="+cos);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n=");
        int n = in.nextInt();
        int []a;
        int []b;
        a=new int[n];
        b=new int[n];
        for (int q=0; q<=n-1; q++) {
            System.out.print("a["+q+"]=");
            a[q]=in.nextInt();
            System.out.print("b["+q+"]=");
            b[q]=in.nextInt();
        }
        Cos(a,b,n);
        SummaV(a,b,n);
    }
}
