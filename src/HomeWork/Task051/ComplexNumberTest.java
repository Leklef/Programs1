package HomeWork.Task051;

/**
 * Created by lenar on 06.12.2015.
 */
public class ComplexNumberTest {
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, -2);
        System.out.print(c1.add(c2));
        System.out.print("\n");
        System.out.print(c1.sub(c2));
        System.out.print("\n");
        System.out.print(c1.multNumber(5));
        System.out.print("\n");
        System.out.print(c1.mult(c2));
        System.out.print("\n");
        System.out.print(c1.div(c2));
        System.out.print("\n");
        System.out.print(c1.lendth());
        System.out.print("\n");
        System.out.print(c1.pow(4));
        System.out.print("\n");
        System.out.print(c1.equals(c2));
        System.out.print("\n");
    }
}
