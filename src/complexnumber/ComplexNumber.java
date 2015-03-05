/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

/**
 *
 * @author Caterina Eracli
 */
public class ComplexNumber {
    
    private double re;
    private double im;
    public ComplexNumber(){
        this.re=0;
        this.im=0;
    }
    public double getRe(){
        return re;
    }
    public double getIm(){
        return im;
    }
    public double getModulus(){
        double modulus=(float) Math.sqrt(((float)Math.pow(this.im, 2))+((float)Math.pow(this.re, 2)));
        return modulus;
    }
    public double getArgument(){
        double argument=0;
        if(getRe()!=0 && getIm()!=0){
            argument= Math.atan(this.im/this.re);
        }
        return Math.toDegrees(argument);
    }
    public void setPolar(double mod, double arg){
        this.re=mod*((float)Math.cos(Math.toRadians(arg)));
        this.im=mod*((float)Math.sin(Math.toRadians(arg)));
    }
    public void setRectangular(double im, double re){
        this.im=im;
        this.re=re;
    }
    public String stampaRectangular(){
        String r = this.getRe() + "+(" + this.getIm() + ")i";
        return r;
    }
    public String stampaPolar(){
        String r = this.getModulus() + "+(" + this.getArgument() + ")i";
        return r;
    }
}
