package HomeWork.Task057;

import HomeWork.Task050.RationalFraction;

/**
 * Created by lenar on 22.12.2015.
 */
public class RationalComplexNumber {
    public RationalFraction ai, bi;

    public RationalComplexNumber() {
        this(new RationalFraction(), new RationalFraction());
    }

    public RationalComplexNumber(RationalFraction a, RationalFraction b) {
        this.ai = a;
        this.bi = b;
    }

    public String toString() {
        return ai + " + " + bi + "i";
    }

    public RationalComplexNumber add(RationalComplexNumber rcn) {
        return new RationalComplexNumber(this.ai.add(rcn.ai), this.bi.add(rcn.bi));
    }

    public RationalComplexNumber sub(RationalComplexNumber rcn) {
        return new RationalComplexNumber(this.ai.sub(rcn.ai), this.bi.sub(rcn.bi));
    }

    public RationalComplexNumber mult(RationalComplexNumber rcn) {
        return new RationalComplexNumber(this.ai.mult(rcn.ai).sub(this.bi.mult(rcn.bi)), this.ai.mult(rcn.bi).add(this.bi.mult(rcn.ai)));
    }
    public static void main(String[] args) {
        RationalComplexNumber c1 = new RationalComplexNumber(new RationalFraction(3,5), new RationalFraction(7, 2));
        RationalComplexNumber c2 = new RationalComplexNumber(new RationalFraction(3,3), new RationalFraction(2, 4));
        System.out.println("add: " + c1.add(c2));
        System.out.println("sub: " + c1.sub(c2));
        System.out.println("mult: " + c1.mult(c2));
    }
}
