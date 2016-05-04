
package ejercicio7;

import java.util.Scanner;
public class Ejercicio7 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int edad, pulsaciones;
        System.out.print("Ingrese su edad: ");
        edad = read.nextInt();
        pulsaciones = (220 - edad) / 10;
        System.out.println("Seria recomendable que usted tenga : " + pulsaciones + " pulsaciones cada 10 segundos");
    }
    
}
