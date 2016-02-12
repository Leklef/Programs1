package HomeWork.Task050;

/**
 * Created by lenar on 04.12.2015.
 */
public class RationalFraction {
    public int x, y;
    public RationalFraction(){
        this.x=0;
        this.y=0;
    }
    public RationalFraction(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void reduce(){
        while (y !=0) {
            int tmp = x%y;
            x = y;
            y = tmp;
        }
    }
    public RationalFraction add(RationalFraction r){
        r.x=r.y*x+y*r.x;
        r.y=y*r.y;
        int o1;
        int o2;
        if (r.x>r.y) {
            o1 = r.x;
            o2=r.y;
        }
        else{
            o1=r.y;
            o2=r.x;
        }
        o1=gcd(o1,o2);
        r.x=r.x/o1;
        r.y=r.y/o1;
        return new RationalFraction(r.x, r.y);
    }
    public void add2(RationalFraction r){
        x=r.y*x+y*r.x;
        y=y*r.y;
        int o1;
        int o2;
        if (x>y) {
            o1=x;
            o2=y;
        }
        else{
            o1=y;
            o2=x;
        }
        o1=gcd(o1,o2);
        x=x/o1;
        y=y/o1;
    }
    public RationalFraction sub(RationalFraction r){
        int ost=1;
        int o1;
        int o2;
        if (r.x>r.y) {
            o1 = r.x;
            o2=r.y;
        }
        else{
            o1=r.y;
            o2=r.x;
        }
        o1=gcd(o1,o2);
        r.x=r.x/o1;
        r.y=r.y/o1;
        if (x>y) {
            o1=x;
            o2=y;
        }
        else{
            o1=y;
            o2=x;
        }
        o1=gcd(o1,o2);
        x=x/o1;
        y=y/o1;
        r.x=y*r.x-r.y*x;
        r.y=y*r.y;
        return new RationalFraction(r.x, r.y);
    }
    public void sub2(RationalFraction r){
        x=r.y*x-y*r.x;
        y=y*r.y;
        int o1;
        int o2;
        if (r.x>r.y) {
            o1 = r.x;
            o2=r.y;
        }
        else{
            o1=r.y;
            o2=r.x;
        }
        o1=gcd(o1,o2);
        r.x=r.x/o1;
        r.y=r.y/o1;
        if (x>y) {
            o1=x;
            o2=y;
        }
        else{
            o1=y;
            o2=x;
        }
        o1=gcd(o1,o2);
        x=x/o1;
        y=y/o1;
        x=r.y*x-y*r.x;
        y=y*r.y;
    }
    public RationalFraction mult(RationalFraction r){
        r.x=x*r.x;
        r.y=y*r.y;
        int o1;
        int o2;
        if (r.x>r.y) {
            o1 = r.x;
            o2=r.y;
        }
        else{
            o1=r.y;
            o2=r.x;
        }
        o1=gcd(o1,o2);
        r.x=r.x/o1;
        r.y=r.y/o1;
        return new RationalFraction(r.x, r.y);
    }
    public void mult2(RationalFraction r){
        x=x*r.x;
        y=y*r.y;
        int o1;
        int o2;
        if (x>y) {
            o1=x;
            o2=y;
        }
        else{
            o1=y;
            o2=x;
        }
        o1=gcd(o1,o2);
        x=x/o1;
        y=y/o1;
    }
    public RationalFraction div(RationalFraction r){
        r.x=x*r.y;
        r.y=y*r.x;
        int o1;
        int o2;
        if (r.x>r.y) {
            o1 = r.x;
            o2=r.y;
        }
        else{
            o1=r.y;
            o2=r.x;
        }
        o1=gcd(o1,o2);
        r.x=r.x/o1;
        r.y=r.y/o1;
        return new RationalFraction(r.x, r.y);
    }
    public void div2(RationalFraction r){
        x=x*r.y;
        y=y*r.x;
        int o1;
        int o2;
        if (x>y) {
            o1=x;
            o2=y;
        }
        else{
            o1=y;
            o2=x;
        }
        o1=gcd(o1,o2);
        x=x/o1;
        y=y/o1;
    }
    public String toString(){
        return ((x<0&&y>0)||(x>0&&y<0) ? "-("+((int)Math.abs(x))+"/"+((int)Math.abs(y))+")": (x<0&&y<0)||(x>0&&y>0)? ((int)Math.abs(x)+"/"+(int)Math.abs(y)): "0");
    }
    public double value(){
        return x/y;
    }
    public boolean equals(RationalFraction r){
        int o1;
        int o2;
        if (r.x>r.y) {
            o1 = r.x;
            o2=r.y;
        }
        else{
            o1=r.y;
            o2=r.x;
        }
        o1=gcd(o1,o2);
        r.x=r.x/o1;
        r.y=r.y/o1;
        if (x>y) {
            o1=x;
            o2=y;
        }
        else{
            o1=y;
            o2=x;
        }
        o1=gcd(o1,o2);
        x=x/o1;
        y=y/o1;
        return ((x==r.x)&&(y==r.y));
    }
    public int numberPart(){
        return (int) Math.floor(x/y);
    }
    public static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}