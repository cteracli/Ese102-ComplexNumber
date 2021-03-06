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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        ComplexNumber.setInitRectangular(0, 0);
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);        
        
        String linea;
	ComplexNumber a=new ComplexNumber();
        double re=0;
        boolean valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci numero reale: ");
            linea = tastiera.readLine();
            try {
                re=Double.valueOf(linea);
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
                im=Double.valueOf(linea);
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        a.setRectangular(re, im);
        a.setStringFormat(ComplexNumber.StringFormat.POLAR);
	System.out.println("Coordinate polari: " +a);
        a.setStringFormat(ComplexNumber.StringFormat.RECTANGULAR);
        System.out.println("Coordinate cartesiane: " +a);
        
	double arg=0;
         valoreValido=false;
        while(!valoreValido) {
            System.out.print("Inserisci argomento: ");
            linea = tastiera.readLine();
            try {
                arg=Double.valueOf(linea);
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
                mod=Double.valueOf(linea);
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }

	a.setPolar(mod, arg);
        a.setStringFormat(ComplexNumber.StringFormat.POLAR);
	System.out.println("Coordinate polari: " +a);
        a.setStringFormat(ComplexNumber.StringFormat.RECTANGULAR);
        System.out.println("Coordinate cartesiane: " +a);

        
        ComplexNumber b=new ComplexNumber();
        
        valoreValido=false;
        double re1=0;
        while(!valoreValido) {
            System.out.print("Inserisci numero reale per le operazioni: ");
            linea = tastiera.readLine();
            try {
                re1=Double.valueOf(linea);
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
                im1=Double.valueOf(linea);
                valoreValido=true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        b.setRectangular(re1, im1);
        
        ComplexNumber sum;
        sum=ComplexNumber.add(a, b);
        
        ComplexNumber subtraction;
        subtraction=ComplexNumber.sub(a, b);
        
        ComplexNumber multiplication;
        multiplication=ComplexNumber.multiply(a, b);
        
        ComplexNumber division;
        division=ComplexNumber.divide(a, b);
        
        ComplexNumber conjugation;
        conjugation=ComplexNumber.getConjugate(a);
        
        sum.setStringFormat(ComplexNumber.StringFormat.RECTANGULAR);
        System.out.println("Addizione coordinate cartesiane: " +sum);
        sum.setStringFormat(ComplexNumber.StringFormat.POLAR);
        System.out.println("Addizione coordinate polari: " +sum);
        
        subtraction.setStringFormat(ComplexNumber.StringFormat.RECTANGULAR);
        System.out.println("Sottrazione coordinate cartesiane: " +subtraction);
        subtraction.setStringFormat(ComplexNumber.StringFormat.POLAR);
        System.out.println("Sottrazione coordinate polari: " +subtraction);
        
        multiplication.setStringFormat(ComplexNumber.StringFormat.RECTANGULAR);
        System.out.println("Moltiplicazione coordinate cartesiane: " +multiplication);
        multiplication.setStringFormat(ComplexNumber.StringFormat.POLAR);
        System.out.println("Moltiplicazione coordinate polari: " +multiplication);
        
        division.setStringFormat(ComplexNumber.StringFormat.RECTANGULAR);
        System.out.println("Divisione coordinate cartesiane: " +division);
        division.setStringFormat(ComplexNumber.StringFormat.POLAR);
        System.out.println("Divisione coordinate polari: " +division);
        
        conjugation.setStringFormat(ComplexNumber.StringFormat.RECTANGULAR);
        System.out.println("Coniugazione Complessa: " +conjugation);
        
        ComplexNumber x=new ComplexNumber();
        ComplexNumber y=new ComplexNumber();
    
        x.setRectangular(1,1);
        y.setRectangular(1,1);
    
        if(x==y){
            System.out.println("x e y si riferiscono alla medesima istanza");
        }
        else{
            System.out.println("x e y si riferiscono a due istanze differenti");
        }

        if (a.equals(b)){
            System.out.println("Il numero complesso x coincide y");
        }
        else {
            System.out.println("Il numero complesso x è diverso da y");
        }
    
    }

    
}
