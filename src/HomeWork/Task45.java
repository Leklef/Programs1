package HomeWork;

import java.util.Scanner;

/**
 * Created by lenar on 18.12.2015.
 */
public class Task45 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int s1=0;
        int s2=0;
        System.out.print("n = ");
        int n = in.nextInt();
        String []team = new String[n];
        for (int i = 0; i < n; i++){
            System.out.print("Team [" + i + "] ");
            team[i] = in.next();
        }
        System.out.print("k = ");
        int k = in.nextInt();
        int j;
        String []scores = new String[k];
        for (int i = 0; i < k; i++){
            System.out.print("Score [" + i + "] ");
            scores[i] = in.next();
        }
        for (int i = 0; i < k; ){
            int t1 = (int) (Math.random()*k);
            int t2 = (int) (Math.random()*k);
            if (t1 != t2){
                System.out.print(team[t1] + " " + team[t2] + " ");
                System.out.print(scores[i] + " ");
                for (j=0; j<scores[i].length(); j++){
                    char aChar = scores[i].charAt(j);
                    int cod = (int) aChar;
                    if ((cod >=48) && (cod <=57)){
                        s1 = cod-48;
                        j=j+1;
                        break;
                    }
                }
                for ( ; j<scores[i].length(); j++){
                    char aChar = scores[i].charAt(j);
                    int cod = (int) aChar;
                    if ((cod >=48) && (cod <=57)){
                        s2 = cod-48;
                        break;
                    }
                }
                s1=s1-s2;
                System.out.print("(" + s1 + ")");
                i++;
                System.out.print("\n");
            }
        }
    }
}
