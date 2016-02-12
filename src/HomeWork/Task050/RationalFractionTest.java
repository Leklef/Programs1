package HomeWork.Task050;

/**
 * Created by lenar on 06.12.2015.
 */
public class RationalFractionTest {
    public static void main(String[] args){
        RationalFraction r = new RationalFraction(18, 2);
        RationalFraction r2 = new RationalFraction(1, 4);
        System.out.print(r.add(r2));
        System.out.print("\n");
        System.out.print(r.sub(r2));
        System.out.print("\n");
        System.out.print(r.mult(r2));
        System.out.print("\n");
        System.out.print(r.div(r2));
        System.out.print("\n");
        System.out.print(r.value());
        System.out.print("\n");
        System.out.print(r.equals(r2));
        System.out.print("\n");
        System.out.print(r.numberPart());
    }
}
