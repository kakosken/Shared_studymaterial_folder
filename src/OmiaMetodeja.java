/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rivetech
 */
public class OmiaMetodeja 
{
    public static void main(String[] args)
    {
        double isonHampparinHinta = 5.99;
        double mediumHampparinHinta = 4.50;
        double pienenHampparinHinta = 3.00;        
        double isotRanskalaisetHinta = 2.50;
        double pienetRanskalaisetHinta = 1.80;
        heippa();
        hinnasto(isonHampparinHinta, mediumHampparinHinta, pienenHampparinHinta, isotRanskalaisetHinta, pienetRanskalaisetHinta);
        
    }
    static void heippa()
    {
        System.out.println("Tervetuloa Rasvaburgeriin!");
    }
    static void hinnasto(double a, double b, double c, double d, double e)
    {
        System.out.println("Hampurilaiset: ");
        System.out.println("Iso burgeri: " + a + " €");
        System.out.println("Medium burgeri: " + b + " €");
        System.out.println("Pieni burgeri: " + c + " €");
        System.out.println("Ranskalaiset: ");
        System.out.println("Isot ranskalaiset: " + d + " €");
        System.out.println("Pienet ranskalaiset: " + e + " €");
    }        
    
}
