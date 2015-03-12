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
    private static double initRe;
    private static double initIm;
    
    private double re;
    private double im;
    
     private StringFormat format;
     static public enum StringFormat{
         RECTANGULAR,
         POLAR
     
     }
     
     static private StringFormat initFormat;
     public void setStringFormat(StringFormat format){
         this.format=format;
     }
   
    public ComplexNumber(){
        this.re=initRe;
        this.im=initIm;
        this.format = ComplexNumber.initFormat;
    }
    static public void setInitRectangular(double re, double im){
        initRe=re;
        initIm=im;
        initFormat=StringFormat.RECTANGULAR;
    }
    static public void setInitPolar(double modulus, double argument){
        if(modulus<0){
            throw new IllegalArgumentException("Valore del modulo errato: deve essere magiore od uguale a 0.");
        }
        initRe=modulus*Math.cos(argument);
        initIm=modulus*Math.sin(argument);
        initFormat=StringFormat.POLAR;
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
        String r = (float) this.getRe() + "+(" + (float) this.getIm() + ")i";
        return r;
    }
    public String stampaPolar(){
        String r = (float) this.getModulus() + "+(" + (float) this.getArgument() + ")i";
        return r;
    }
    static public ComplexNumber add(ComplexNumber operand1, ComplexNumber operand2){
        ComplexNumber sum=new ComplexNumber();
        double re=operand1.getRe()+operand2.getRe();
        double im=operand1.getIm()+operand2.getIm();
        sum.setRectangular(re, im);
        return sum;
    }
    static public ComplexNumber sub(ComplexNumber operand1, ComplexNumber operand2){
        ComplexNumber subtraction=new ComplexNumber();
        double re=operand1.getRe()-operand2.getRe();
        double im=operand1.getIm()-operand2.getIm();
        subtraction.setRectangular(re, im);
        return subtraction;
    }
    static public ComplexNumber multiply(ComplexNumber operand1, ComplexNumber operand2){
        ComplexNumber multiplication=new ComplexNumber();
        double modulus=operand1.getModulus()*operand2.getModulus();
        double argument=operand1.getArgument()+operand2.getArgument();
        multiplication.setPolar(modulus, argument);
        return multiplication;
    }
    static public ComplexNumber divide(ComplexNumber operand1, ComplexNumber operand2){
        ComplexNumber division=new ComplexNumber();
        double modulus=operand1.getModulus()/operand2.getModulus();
        double argument=operand1.getArgument()-operand2.getArgument();
        division.setPolar(modulus, argument);
        return division;
    }
    static public ComplexNumber getConjugate(ComplexNumber operand){
        ComplexNumber conjugation=new ComplexNumber();
        double re=operand.getRe();
        double im=operand.getIm();
        conjugation.setRectangular(-im, re);
        return conjugation;
    }
    
    @Override
	public boolean equals(Object o) {
		boolean r = false;
		if(o instanceof ComplexNumber) {
			ComplexNumber p = (ComplexNumber)o;
			if(this.re == p.getRe() && this.im == p.getIm()) {
				r = true;
			}
		}
		return r;
	}
        
         @Override
    public String toString() {
        return toString(this.format);
    }
    
     public String toString(StringFormat format) {
        String r = new String();
        switch(format) {
            case RECTANGULAR:
                r = (float)(this.re) + "+(" + (float)(this.im) + ")i";
                break;
            case POLAR:
                r = (float)(this.getModulus()) + "*exp(i*" + (this.getArgument()) +")";
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
    }
}