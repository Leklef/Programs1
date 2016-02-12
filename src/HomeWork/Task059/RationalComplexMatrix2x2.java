package HomeWork.Task059;

import HomeWork.Task050.RationalFraction;
import HomeWork.Task057.RationalComplexNumber;
import HomeWork.Task058.RationalComplexVector2D;

/**
 * Created by lenar on 22.12.2015.
 */
public class RationalComplexMatrix2x2 {
    RationalComplexNumber[][] m;

    public RationalComplexMatrix2x2() {
        m = new RationalComplexNumber[2][2];
    }

    public RationalComplexMatrix2x2(RationalComplexNumber[][] rcn) {
        m = rcn;
    }

    public RationalComplexMatrix2x2(RationalComplexNumber rcn1, RationalComplexNumber rcn2, RationalComplexNumber rcn3, RationalComplexNumber rcn4) {
        this(new RationalComplexNumber[][]{{rcn1, rcn2}, {rcn3, rcn4}});
    }

    public RationalComplexMatrix2x2 add(RationalComplexMatrix2x2 rcm) {
        RationalComplexNumber[][] rcopy = new RationalComplexNumber[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                rcopy[i][j] = this.m[i][j].add(rcm.m[i][j]);
            }
        }
        return new RationalComplexMatrix2x2(rcopy);
    }

    public RationalComplexMatrix2x2 mult(RationalComplexMatrix2x2 rcm) {
        RationalComplexNumber[][] rcopy = new RationalComplexNumber[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    rcopy[i][j] = this.m[i][k].mult(rcm.m[k][j]);
                }
            }
        }
        return new RationalComplexMatrix2x2(rcopy);
    }

    public RationalComplexNumber det() {
        RationalComplexNumber r;
        r = m[0][0].mult(m[1][1]).sub(m[1][0].mult(m[0][1]));
        return r;
    }

    public RationalComplexVector2D multVector(RationalComplexVector2D rcv) {
        RationalComplexVector2D vec = new RationalComplexVector2D();
        vec.x = m[0][0].mult(vec.x).add(m[0][1].mult(vec.y));
        vec.y = m[1][0].mult(vec.x).add(m[1][1].mult(vec.y));
        return vec;
    }
    public static void main(String[] args) {
        RationalComplexMatrix2x2 m = new RationalComplexMatrix2x2((new RationalComplexNumber(new RationalFraction(4, 5), new RationalFraction(3, 4))),(new RationalComplexNumber(new RationalFraction(4, 5), new RationalFraction(3, 4))),(new RationalComplexNumber(new RationalFraction(4, 5), new RationalFraction(3, 4))),(new RationalComplexNumber(new RationalFraction(4, 5), new RationalFraction(3, 4))));
        RationalComplexVector2D ve = new RationalComplexVector2D(new RationalComplexNumber(new RationalFraction(3,4), new RationalFraction(5,2)), new RationalComplexNumber(new RationalFraction(3, 2), new RationalFraction(6, 4)));
        System.out.println("add: " + m.add(m));
        System.out.println("mult: " + m.mult(m));
        System.out.println("det: " + m.det());
        System.out.println("multVector: " + m.multVector(ve));
    }
}
