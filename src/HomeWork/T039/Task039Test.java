package HomeWork.T039;

import static HomeWork.T039.Task039.Chip;

/**
 * Created by lenar on 08.12.2015.
 */

public class Task039Test {
    public static void main(String[] args){
        int k=34, n=5, m=3;
        int [][] p = new int[m][n];
        p[0][0]=2; p[0][1]=3; p[0][2]=4; p[0][3]=3; p[0][4]=4;
        p[1][0]=1; p[1][1]=4; p[1][2]=2; p[1][3]=3; p[1][4]=4;
        p[2][0]=3; p[2][1]=4; p[2][2]=5; p[2][3]=0; p[2][4]=3;
       Chip(k, n, m, p);
    }
}
