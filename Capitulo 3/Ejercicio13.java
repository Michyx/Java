
package ejercicio13;

import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
        double num1;
        double num1In;
        double vend;
        double local;
        double estatal;
        System.out.println("Cual es el num1 del vehiculo?");
        num1In = read.nextInt();
        num1 = num1In;
        vend = num1 * 0.08;
        local = num1 * 0.03;
        num1 += vend + local;
        estatal = num1 * 0.03;
        num1 += estatal;
        System.out.println("");
        System.out.println("El costo total sera de : $" + (int)num1);
        System.out.println("");
        System.out.println("--------------Detalle-------------");
        System.out.println("Costo del Vehiculo          $" + (int)num1In);
        System.out.println("Porcentaje del vendedor     $" + (int)vend);
        System.out.println("Impuesto Local              $" + (int)local);
        System.out.println("Impuesto estatal            $" + (int)estatal);
    }
    
}
