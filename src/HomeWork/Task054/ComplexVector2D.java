package HomeWork.Task054;

import HomeWork.Task051.ComplexNumber;

/**
 * Created by lenar on 22.12.2015.
 */
public class ComplexVector2D {
    public ComplexNumber x, y;
    public ComplexVector2D() {
        x = new ComplexNumber();
        y = new ComplexNumber();
    }
    public ComplexVector2D(ComplexNumber a, ComplexNumber b) {
        this.x = a;
        this.y = b;
    }
    public ComplexVector2D add(ComplexVector2D v) {
        return new ComplexVector2D(this.x.add(v.x), this.y.add(v.x));
    }
    public String toString() {
        return "(" + this.x + "), (" + this.y + ")";
    }
    public ComplexNumber scalarProduct(ComplexVector2D v) {
        ComplexNumber c = this.x.add(v.x).add(this.y.add(y));
        return c;
    }
    public boolean equals(ComplexVector2D v) {
        return this.x.equals(v.x) && this.y.equals(v.y);
    }
    public static void main(String[] args) {
        ComplexVector2D a1 = new ComplexVector2D(new ComplexNumber(3, -1), new ComplexNumber(4, 5));
        ComplexVector2D a2 = new ComplexVector2D(new ComplexNumber(2, 3), new ComplexNumber(-4, 7));
        System.out.println("add: " + a1.add(a2));
        System.out.println("scalarProduct: " + a1.scalarProduct(a2));
        System.out.println("equals: " + a1.equals(a2));
    }
}
