package HomeWork.Task047;
import java.util.*;
/**
 * Created by lenar on 30.11.2015.
 */
public class Taskm38 {
    public static double[][] Matrix(int n, double [][]a){
        double p;
        for (int k = 1; k < a.length; k++) {
            for (int j = k; j < a.length; j++) {
                p = a[j][k - 1] / a[k - 1][k - 1];
                for (int i = 0; i < n; i++) {
                    a[j][i] = a[j][i] - p * a[k - 1][i];
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print ("Input n:");
        int n = in.nextInt();
        System.out.print ("Input m:");
        int m = in.nextInt();
        double [][]a;
        a=new double [n][m];
        for (int i=0; i<n; i++ ) {
            for (int j=0; j<m; j++) {
                System.out.print ("a["+i+"]["+j+"]=");
                a[i][j]=in.nextDouble();
            }
        }
        for (int i=0; i<n; i++ ) {
            for (int j=0; j<m; j++) {
                System.out.print (a[i][j]+" ");
            }
            System.out.print("\n");
        }
        a=Matrix(n,a);
        System.out.print("\n");
        for (int i=0;i<n;i++) {
            for (int j=0; j<m; j++) {
                System.out.print (a[i][j]+" ");
            }
            System.out.print ("\n");
        }
    }
}
