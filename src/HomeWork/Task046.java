package HomeWork;

import java.util.Scanner;

/**
 * Created by lenar on 24.11.2015.
 */
public class Task046 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first lines ");
        String s1 = in.next();
        System.out.print("Enter second lines ");
        String s2 = in.next();
        int min;
        if (s1.length()<s2.length()) {
            min=s1.length();
        }
        else {
            min=s2.length();
        }
        for (int i=0; i<min; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            int q1 = (int)c1;
            int q2 = (int)c2;
            if (q2>q1){
                System.out.print(s1+" ");
                System.out.print(s2);
                break;
            }
            else {
                System.out.print(s2+" ");
                System.out.print(s1);
                break;
            }
        }
    }
}
