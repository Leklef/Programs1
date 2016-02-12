package HomeWork.Task047;

import java.util.Scanner;

/**
 * Created by lenar on 30.11.2015.
 */
public class Taskm08 {
    public static void Umnozhenie (int u){
        for (int g=1; g<10; g++){
            int i=g*u;
            System.out.println(g+"*"+u+"="+i);
        }
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("k = ");
        int j=in.nextInt();
        Umnozhenie(j);
    }
}
