package HomeWork.Triag;
import java.util.*;
/**
 * Created by lenar on 10.11.2015.
 */
public class TriagTest {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Triag t1 = new Triag(0, 0, 1, 2, 3, 0);
        Triag t2 = new Triag(0, 0, 45, 45, 3);
        System.out.println(t2);
        System.out.println("On how many degrees to turn???(180 or 270)");
        int n = in.nextInt();
        if (n == 180) {
            Triag t180 = t1.rotation180(t1);
            System.out.println(t180);
        }

        else {
                if (n == 270){
                    Triag t270 = t1.rotation270(t1);/**вращение на 270 градусов по часовой стрелке**/
                    System.out.println(t270);
                }
                else {
                    System.out.print("Error!!!");
                }

        }
        System.out.println("Input x and y");
        int x = in.nextInt();
        int y = in.nextInt();
        Triag tmove = t1.move(t1, x, y);
        System.out.println(tmove);
    }
}