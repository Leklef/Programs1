package HomeWork.Triag;

/**
 * Created by lenar on 10.11.2015.
 */
public class Triag {
    public double x1, y1, x2, y2, x3, y3;
    public Triag (double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    public Triag (double x1, double y1, double angle1, double angle2, double a) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + a;
        this.y2 = y1;
        double angle3 = 180 - (angle1 + angle2);
        double b = a * (Math.sin(angle2)/Math.sin(angle3));
        this.x3 = x1 + (b*Math.cos(angle1));
        this.y3 = y1 + (b*Math.sin(angle1));
        return ;
    }
    public Triag rotation180 (Triag t) {
        Triag result = new Triag(x3, x2*2, x2, y2, x1, x2*2);
        return result;
    }
    public Triag rotation270 (Triag t) {
        Triag result = new Triag(x2-x1+x3, y1, x2, y2, x2-x1+x3, x3);
        return result;
    }
    public Triag move (Triag t, int x, int y){
        Triag result = new Triag(x1+x, y1+y, x2+x, y2+y, x3+x, y3+y);
        return result;
    }
    public String toString() {
        return "[" + x1 + "," + y1 + "; " + x2 + "," + y2 + ";" + x3 + "," + y3 + "]";
    }
}