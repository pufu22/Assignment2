////////////////////////////////////////////////////////////////////
// Zhen Wei Zheng 1229141
// Jude Vensil Braceros 2011068
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Inserisci un numero da 1 a 1000" );
        Integer input = scanner.nextInt();
        System.out.println(RomanPrinter.print(input));
    }
}
