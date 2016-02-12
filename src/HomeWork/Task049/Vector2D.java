package HomeWork.Task049;

/**
 * Created by lenar on 30.11.2015.
 */
public class Vector2D {
   public double x;
    public double y;

    public Vector2D(){
        this.x=0;
        this.y=0;
    }
    public Vector2D(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Vector2D add(Vector2D v){
        double x=this.x+v.x;
        double y=this.y+v.y;
        Vector2D v2=new Vector2D(x, y);
        return v2;
    }
    public void add2(Vector2D v){
        this.x=this.x+v.x;
        this.y=this.y+v.y;
    }
    public Vector2D sub(Vector2D v){
        this.x=this.x-v.x;
        this.y=this.y-v.y;
        Vector2D v2=new Vector2D(x, y);
        return v2;
    }
    public void sub2(Vector2D v){
        this.x=this.x-v.x;
        this.y=this.y-v.y;
    }
    public Vector2D mult(double d){
        this.x=this.x*d;
        this.y=this.y*d;
        Vector2D v2=new Vector2D(x, y);
        return v2;
    }
    public void mult2(double d){
        this.x=this.x*d;
        this.y=this.y*d;
    }
    public String toString(){
        return "("+x+" ,"+y+")";
    }
    public double lenght(){
        return Math.sqrt(x*x+y*y);
    }
    public double scalarProduct(Vector2D v){
        return ((x*v.x)+(y*v.y));
    }
    public double cos(Vector2D v){
        return (lenght()*Math.sqrt(v.x*v.x+v.y*v.y)/scalarProduct(v));
    }
    public boolean equals(Vector2D v){
        return (x==v.x && y==v.y);
    }
}
