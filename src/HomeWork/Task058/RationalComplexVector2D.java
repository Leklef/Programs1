package HomeWork.Task058;

import HomeWork.Task050.RationalFraction;
import HomeWork.Task057.RationalComplexNumber;

/**
 * Created by lenar on 22.12.2015.
 */
public class RationalComplexVector2D {
    public RationalComplexNumber x, y;

    public RationalComplexVector2D() {
        this(new RationalComplexNumber(), new RationalComplexNumber());
    }

    public RationalComplexVector2D(RationalComplexNumber c1, RationalComplexNumber c2) {
        this.x = c1;
        this.y = c2;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public RationalComplexVector2D add(RationalComplexVector2D rcv) {
        return new RationalComplexVector2D(this.x.add(rcv.x), this.y.add(rcv.y));
    }

    public RationalComplexNumber scalarProduct(RationalComplexVector2D rcv) {
        RationalComplexNumber c = this.x.add(rcv.x).add(this.y.add(rcv.y));
        return c;
    }
    public static void main(String[] args) {
        RationalComplexVector2D c1 = new RationalComplexVector2D(new RationalComplexNumber(new RationalFraction(4, 5), new RationalFraction(3, 4)), new RationalComplexNumber(new RationalFraction(1, 5), new RationalFraction(2, 3)));
        RationalComplexVector2D c2 = new RationalComplexVector2D(new RationalComplexNumber(new RationalFraction(2, 4), new RationalFraction(7, 4)), new RationalComplexNumber(new RationalFraction(4, 6), new RationalFraction(3, 10)));
        System.out.println("add: " + c1.add(c2));
        System.out.println("scalarProduct: " + c1.scalarProduct(c2));
    }
}
