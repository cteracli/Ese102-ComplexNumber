/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese102;

/**
 *
 * @author Caterina Eracli
 */
import java.io.*;
import complexnumber.*;

public class Ese102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);        
        
        String linea = "";
	ComplexNumber a=new ComplexNumber();
        double re=0;
        boolean valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci numero reale: ");
            linea = tastiera.readLine();
            try {
                re=Double.valueOf(linea).doubleValue();
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido=false;
	double im=0;
        while(!valoreValido) {
            System.out.print("Inserisci numero immaginario: ");
            linea = tastiera.readLine();
            try {
                im=Double.valueOf(linea).doubleValue();
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        a.setRectangular(re, im);
	System.out.println("Coordinate polari: " + a.stampaPolar());
        System.out.println("Coordinate cartesiane: " + a.stampaRectangular());
        
	double arg=0;
         valoreValido=false;
        while(!valoreValido) {
            System.out.print("Inserisci argomento: ");
            linea = tastiera.readLine();
            try {
                arg=Double.valueOf(linea).doubleValue();
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido=false;
	double mod= 0;
        while(!valoreValido) {
            System.out.print("Inserisci modulo: ");
            linea=tastiera.readLine();
            try {
                mod=Double.valueOf(linea).doubleValue();
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }

	a.setPolar(mod, arg);
	System.out.println("Coordinate polari: " + a.stampaPolar());
        System.out.println("Coordinate cartesiane: " + a.stampaRectangular());

        
        ComplexNumber b=new ComplexNumber();
        
        valoreValido=false;
        double re1=0;
        while(!valoreValido) {
            System.out.print("Inserisci numero reale per le operazioni: ");
            linea = tastiera.readLine();
            try {
                re1=Double.valueOf(linea).doubleValue();
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido=false;
	double im1=0;
        while(!valoreValido) {
            System.out.print("Inserisci numero immaginario per le operazioni: ");
            linea = tastiera.readLine();
            try {
                im1=Double.valueOf(linea).doubleValue();
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        b.setRectangular(re1, im1);
        
        ComplexNumber sum=new ComplexNumber();
        sum=a.add(b);
        
        ComplexNumber subtraction=new ComplexNumber();
        subtraction=a.sub(b);
        
        ComplexNumber multiplication=new ComplexNumber();
        multiplication=a.multiply(b);
        
        ComplexNumber division=new ComplexNumber();
        division=a.divide(b);
        
        System.out.println("Addizione coordinate cartesiane: " +sum.stampaRectangular());
        System.out.println("Addizione coordinate polari: " +sum.stampaPolar());
        
        System.out.println("Sottrazione coordinate cartesiane: " +subtraction.stampaRectangular());
        System.out.println("Sottrazione coordinate polari: " +subtraction.stampaPolar());
        
        System.out.println("Moltiplicazione coordinate cartesiane: " +multiplication.stampaRectangular());
        System.out.println("Moltiplicazione coordinate polari: " +multiplication.stampaPolar());
        
        System.out.println("Divisione coordinate cartesiane: " +division.stampaRectangular());
        System.out.println("Divisione coordinate polari: " +division.stampaPolar());
    }

    
}
