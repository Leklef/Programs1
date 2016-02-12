package HomeWork.Dop;

import java.util.Scanner;

/**
 * Created by lenar on 18.12.2015.
 */
public class Mnog {
    int []coeff;
    int degree;
    public Mnog (){

    }
    public Mnog (int []coeff, int degree){
        this.coeff=coeff;
        this.degree=degree;
    }
    public int value(int x){
        int s=0;
        int g=degree;
        for (int i=0; i<degree+1; i++){
            s+=coeff[i]*(int)Math.pow(x,g);
            --g;
        }
        return s;
    }
    public Mnog sum (Mnog P1, Mnog P2){
        int max, i;
        max = (P1.degree > P2.degree) ? P1.degree : P2.degree;
        int []add = new int[max + 1];
        if (P1.degree == P2.degree) {
            for (i = P1.degree; i >= 0; i--)
                add[i] = P1.coeff[i] + P2.coeff[i];
        }

        if (P1.degree > P2.degree) {
            for (i = P1.degree; i > P2.degree; i--)
                add[i] = P1.coeff[i];
            for (i = P2.degree; i >= 0; i--)
                add[i] = P1.coeff[i] + P2.coeff[i];
        }

        if (P1.degree < P2.degree) {
            for (i = P2.degree; i > P1.degree; i--)
                add[i] = P2.coeff[i];
            for (i = P1.degree; i >= 0; i--)
                add[i] = P1.coeff[i] + P2.coeff[i];
        }
        return new Mnog(add, max);
    }
    public Mnog sub (Mnog P1, Mnog P2){
        int max, i;
        max = (P1.degree > P2.degree) ? P1.degree : P2.degree;
        int []sub = new int[max + 1];
        if (P1.degree == P2.degree) {
            for (i = P1.degree; i >= 0; i--)
                sub[i] = P1.coeff[i] - P2.coeff[i];
        }

        if (P1.degree > P2.degree) {
            for (i = P1.degree; i > P2.degree; i--)
                sub[i] = P1.coeff[i];
            for (i = P2.degree; i >= 0; i--)
                sub[i] = P1.coeff[i] - P2.coeff[i];
        }

        if (P1.degree < P2.degree) {
            for (i = P2.degree; i > P1.degree; i--)
                sub[i] = -P2.coeff[i];
            for (i = P1.degree; i >= 0; i--)
                sub[i] = P1.coeff[i] - P2.coeff[i];
        }
        return new Mnog(sub, max);
    }
    public Mnog mult(Mnog P1, Mnog P2){
        int i, j, max;
        max = P1.degree + P2.degree;
        int []mul = new int[max + 1];

        for (i = P1.degree; i >= 0; i--)
            for (j = P2.degree; j >= 0; j--)
                mul[i + j] += P1.coeff[i] * P2.coeff[j];

        return new Mnog(mul, max);
    }
    public String toString(){
        String s="";
        int i;
        for (i = degree; i >= 0; i--) {
            s+=coeff[i] + "x^" + i;
            if ((i - 1) != -1)
                s+="+";
        }
        return s;
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Degree Of Polynomial: ");
        int degree = in.nextInt();
        int []coeff = new int[degree + 1];
        for (int i=degree; i>=0; i--){
            System.out.print("Enter coefficient of x^" + i + ": ");
            coeff[i]=in.nextInt();
        }
        int degree2 = in.nextInt();
        int []coeff2 = new int[degree2 + 1];
        for (int i=degree2; i>=0; i--){
            System.out.print("Enter coefficient of x^" + i + ": ");
            coeff2[i]=in.nextInt();
        }
        Mnog P1=new Mnog(coeff, degree);
        Mnog P2=new Mnog(coeff2, degree2);
        Mnog P3=new Mnog();
        System.out.print("x = ");
        int x=in.nextInt();
        System.out.println(P1.value(x));
        System.out.println(P3.sum(P1, P2));
        System.out.println(P3.sub(P1, P2));
        System.out.println(P3.mult(P1, P2));
    }
}
