package HomeWork.Task049;

/**
 * Created by lenar on 06.12.2015.
 */
public class Vector2DTest {
    public static void main(String[] args){
        Vector2D v = new Vector2D(1, 4);
        Vector2D v2 = new Vector2D(2, 3);
        System.out.print(v.add(v2));
        System.out.print("\n");
        System.out.print(v.sub(v2));
        System.out.print("\n");
        System.out.print(v.mult(3));
        System.out.print("\n");
        System.out.print(v.lenght());
        System.out.print("\n");
        System.out.print(v.scalarProduct(v2));
        System.out.print("\n");
        System.out.print(v.cos(v2));
        System.out.print("\n");
        System.out.print(v.equals(v2));
    }
}
