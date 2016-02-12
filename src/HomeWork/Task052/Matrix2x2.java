package HomeWork.Task052;

/**
 * Created by lenar on 18.12.2015.
 */
import HomeWork.Task049.Vector2D;

import java.util.*;

public class Matrix2x2 {
    double[][] a;

    public Matrix2x2() {
        a = new double[2][2];
    }

    public Matrix2x2(double k) {
        this(k, k, k, k);
    }

    public Matrix2x2(double[][] a) {
        this.a = a;
    }

    public Matrix2x2(double x, double y, double z, double u) {
        this(new double[][]{{x, y}, {z, u}});
    }

    public Matrix2x2 add(Matrix2x2 a) {
        double[][] aCopy = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aCopy[i][j] += a.a[i][j];
            }
        }
        return new Matrix2x2(aCopy);
    }

    public void add2(Matrix2x2 a) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] += a.a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(this.a));
    }

    public Matrix2x2 sub(Matrix2x2 a) {
        double[][] aCopy = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aCopy[i][j] -= a.a[i][j];
            }
        }
        return new Matrix2x2(aCopy);
    }

    public void sub2(Matrix2x2 a) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                this.a[i][j] -= a.a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(this.a));
    }

    public Matrix2x2 multNumber(double k) {
        double[][] aCopy = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aCopy[i][j] = this.a[i][j] * k;
            }
        }
        return new Matrix2x2(aCopy);
    }

    public void multNumber2(double k) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] *= k;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }

    public Matrix2x2 mult(Matrix2x2 a) {
        double[][] aCopy = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    aCopy[i][j] += this.a[i][k] * a.a[k][j];
                }
            }
        }
        return new Matrix2x2(aCopy);
    }

    public void mult2(Matrix2x2 a) {
        double[][] aCopy = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                double s = 0;
                for (int k = 0; k < 2; k++) {
                    aCopy[i][j] += this.a[i][k] * a.a[k][j];
                }
            }
        }
        this.a = aCopy;
        System.out.println(Arrays.deepToString(this.a));
    }

    public double det() {
        double det = this.a[0][0] * this.a[1][1] - this.a[0][1] * this.a[1][0];
        return det;
    }

    public void transpon() {
        double[][] aCopy = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aCopy[i][j] = a[j][i];
            }
        }
        a = aCopy;
        System.out.println(Arrays.deepToString(a));
    }

    public Matrix2x2 inverseMatrix() {
        if (det() != 0) {
            System.out.println("Matrix: " + Arrays.deepToString(a));
            System.out.print("transpon: ");
            transpon();
            System.out.print("transponMatrix * " + Math.abs(det()) + ": ");
            multNumber2(1 / Math.abs(det()));
        } else {
            System.out.println("no inversive matrix");
            a = new double[2][2];
        }
        return new Matrix2x2(a);
    }

    public Matrix2x2 equivalentDiagonal() {
        System.out.println(Arrays.deepToString(a));
        double[][] aCopy;
        aCopy = a;
        if(aCopy[0][0] == 0) {
            if(aCopy[0][1] != 0) {
                aCopy[0][0] += aCopy[0][1];
                aCopy[1][0] += aCopy[1][1];
            } else if(aCopy[1][0] != 0) {
                aCopy[0][0] += aCopy[1][0];
                aCopy[0][1] += aCopy[1][1];
            }
        }
        if(aCopy[1][1] == 0) {
            if(aCopy[0][1] != 0) {
                aCopy[1][1] += aCopy[0][1];
                aCopy[1][0] += aCopy[0][0];
            } else if(aCopy[1][0] != 0) {
                aCopy[1][1] += aCopy[1][0];
                aCopy[0][1] += aCopy[0][0];
            }
        }
        aCopy[0][0] -= aCopy[0][1] * aCopy[1][0] / aCopy[1][1];

        aCopy[0][1] = 0;
        aCopy[1][0] = 0;
        return new Matrix2x2(aCopy);
    }

    public Vector2D multVector(Vector2D v) {
        double[] aCopy = new double[2];
        aCopy[0] = a[0][0] * v.x + a[0][1] * v.y;
        aCopy[1] = a[1][0] * v.x + a[1][1] * v.y;
        return new Vector2D(aCopy[0], aCopy[1]);
    }

    public String toString() {
        return Arrays.deepToString(a);
    }
    public static void main(String[]args){
        Matrix2x2 a1 = new Matrix2x2();
        Matrix2x2 a2 = new Matrix2x2(7);
        Matrix2x2 a3 = new Matrix2x2(new double[][] {{3, 2}, {4, 5}});
        Matrix2x2 a4 = new Matrix2x2(4, 6, 7, 3);
        Vector2D v = new Vector2D(2, 5);
        System.out.println("add: ");
        System.out.println(a3.add(a4));
        System.out.println("add2: "); a2.add2(a4);
        System.out.println();
        System.out.println("sub: ");
        System.out.println(a2.sub(a3));
        System.out.println("sub2: "); a1.sub2(a4);
        System.out.println();
        System.out.println("multNumber: ");
        System.out.println(a1.multNumber(-2));
        System.out.println("multNumber2: "); a1.multNumber2(-3);
        System.out.println();
        System.out.println("mult: ");
        System.out.println(a1.mult(a4));
        System.out.println("multNumber2: "); a2.mult2(a3);
        System.out.println();
        System.out.println("det: " + a1.det());
        System.out.println();
        System.out.println("transpon: "); a3.transpon();
        System.out.println();
        System.out.println("inverseMatrix: "); a3.inverseMatrix();
        System.out.println();
        System.out.println("equivalentDiagonal: " + a4.equivalentDiagonal());
        System.out.println();
        System.out.println("multVector: " + a3.multVector(v));
    }
}