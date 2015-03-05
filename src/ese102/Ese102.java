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
        
        a.setRectangular(im, re);
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
        System.out.println("Coordinate cartesiane: " + a.stampaRectangular
        ());


    }

    
}
