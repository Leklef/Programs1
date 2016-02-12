package HomeWork.Task053;

import HomeWork.Task050.RationalFraction;

/**
 * Created by lenar on 22.12.2015.
 */
public class RationalVector2D {
    public RationalFraction a, b;
    public RationalVector2D() {
        a = new RationalFraction();
        b = new RationalFraction();
    }
    public RationalVector2D(RationalFraction a, RationalFraction b) {
        this.a = a;
        this.b = b;
    }
    public RationalVector2D add(RationalVector2D v) {
        RationalFraction newA = a.add(v.a);
        RationalFraction newB = b.add(v.b);
        return new RationalVector2D(newA, newB);
    }
    public String toString() {
        return a + ", " + b;
    }
    public double length() {
        RationalFraction length = a.mult(a).add(b.mult(b));
        length.reduce();
        return Math.sqrt(length.value());
    }
    public RationalFraction scalarProduct(RationalVector2D v) {
        RationalFraction R = this.a.add(a).add(this.b.add(b));
        R.reduce();
        return R;
    }
    public boolean equals(RationalVector2D v) {
        return a.equals(v.a) && b.equals(v.b);
    }
    public static void main(String [] args){
        RationalVector2D a1 = new RationalVector2D(new RationalFraction(3, 2), new RationalFraction(4, 5));
        RationalVector2D a2 = new RationalVector2D(new RationalFraction(4, 2), new RationalFraction(4, 5));
        System.out.println("add: " + a1.add(a2));
        System.out.println("length: " + a2.length());
        System.out.println("scalarProduct: " + a1.scalarProduct(a2));
        System.out.println("equals: " + a1.equals(a2));
    }
}

