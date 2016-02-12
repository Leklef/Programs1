public class Circle {
    private int x1,y1,x2,y2;
    private double c1, c2, l, rad;
    public Circle(double c1, double c2,int rad){
        this.c1=c1;
        this.c2=c2;
        this.rad=rad;
    }
    public Circle(double l){
        this.l=l;
        this.rad=l/2;
    }
    public String CircleD(int x1, int y1, int x2, int y2) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.c1=(Math.abs(x1-x2))/2;
        this.c2=(Math.abs(y1-y2))/2;
        this.rad=c1+x1;
        String result = c1+" "+c2+" "+rad;
        return result;
    }
    public String move(int x, int y){
        this.c1=c1+x;
        this.c2=c2+y;
        String result = c1+" "+c2+" "+rad;
        return result;
    }
    public boolean isInside(int x, int y){
        return (((x-c1)*(x-c1)+(y-c2)*(y-c2))<rad*rad);
    }
    public double Square(double rad){
        return (Math.PI*(rad*rad));
    }
    public double Weight(double rad){
        return (2*Math.PI*(rad*rad));
    }
    public String boundingBox(){
        double x1=c1-rad;
        double y1=c2-rad;
        double x2=c1+rad;
        double y2=c2+rad;
        return (x1+" "+y1+" "+x2+" "+y2);
    }
    public static void main(String[] args){
        Circle a = new Circle(1,1,2);
        Circle b = new Circle(3);
        System.out.println(a.CircleD(1,3,4,2));
        System.out.println(a.move(1,1));
        System.out.println(a.isInside(1,1));
        System.out.println(a.Square(5));
        System.out.println(a.Weight(4));
        System.out.print(a.boundingBox());
    }
}
