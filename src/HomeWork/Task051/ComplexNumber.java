package HomeWork.Task051;

/**
 * Created by lenar on 06.12.2015.
 */
public class ComplexNumber {
    public double re, im;
    public ComplexNumber(){
        this.im=0;
        this.re=0;
    }
    public ComplexNumber(double re, double im){
        this.im=im;
        this.re=re;
    }
    public ComplexNumber add(ComplexNumber c){
        return new ComplexNumber(re + c.re, im + c.im);
    }
    public void add2(ComplexNumber c){
        this.im=this.im+c.im;
        this.re=this.re+c.re;
    }
    public ComplexNumber sub(ComplexNumber c){
        return new ComplexNumber(re - c.re, im - c.im);
    }
    public void sub2(ComplexNumber c){
        this.re=this.re-c.re;
        this.im=this.im-c.im;
    }
    public ComplexNumber multNumber(double s){
        this.re=this.re*s;
        this.im=this.im*s;
        ComplexNumber c=new ComplexNumber(re,im);
        return c;
    }
    public void multNumber2(double s){
        this.re=this.re*s;
        this.im=this.im*s;
    }
    public ComplexNumber mult(ComplexNumber c){
        c.im=c.im*im;
        c.re=c.re*re;
        return c;
    }
    public void mult2(ComplexNumber c){
        c.im=c.im*this.im;
        c.re=c.re*this.re;
    }
    public ComplexNumber div(ComplexNumber c){
        c.re=c.re/this.re;
        c.im=c.im/this.im;
        return c;
    }
    public void div2(ComplexNumber c){
        this.re=this.re/c.re;
        this.im=this.im/c.im;
    }
    public double lendth(){
        return Math.sqrt(re*re+im*im);
    }
    public String toString(){
        return re + (im <= 0.0 ? "" : "+") + (im==0.0 ? "" : im + "*i");
    }
    public double arg(){
        return Math.atan(im/re);
    }
    public ComplexNumber pow(double n){
        return new ComplexNumber((Math.pow(lendth(),n)*Math.cos(arg())),(Math.pow(lendth(),n)*Math.sin(arg())));
    }
    public boolean equals(ComplexNumber c){
        return (this.re==c.re && this.im==c.im);
    }
}
