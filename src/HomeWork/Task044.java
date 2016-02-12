package HomeWork;

import java.util.*;

/**
 * Created by lenar on 24.11.2015.
 */
public class Task044 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of words ");
        int n = in.nextInt();
        System.out.print("Enter words ");
        String []words = new String[n];
        for (int i=0; i<n; i++){
            words[i] = in.next();
        }
        for (int i=0; i<n; i++ ) {
            char c = words[i].charAt(0);
            String s = String.valueOf(c);
            for (int j=65; j<=90; j++) {
                String aChar = new Character((char)j).toString();
                if (s.equals(aChar)){
                    System.out.print(words[i]+" ");
                }
            }
        }
    }
}
