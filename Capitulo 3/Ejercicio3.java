
package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        int edad = 0;
        int dias = 0;
        Scanner read = new Scanner (System.in);
        System.out.println ("Para calcular los dias vividos, por favor ingrese su edad");
        edad = read.nextInt();
        dias = edad * 365;
        System.out.println ("La cantidad de dias vividos es de :"+dias);
        
    }
    
}
