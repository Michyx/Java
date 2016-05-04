
package ejercicio5;

import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
    int sueldoBase, horasExtras, descuento, total;
    System.out.println("Ingrese su sueldo base");
    sueldoBase = read.nextInt();
    System.out.println("Ingrese su monto por horas extras");
    horasExtras = read.nextInt();
    descuento = (int) ((sueldoBase + horasExtras) * 0.2);
    total = sueldoBase + horasExtras - descuento;

        System.out.println("Su sueldo base es de " + sueldoBase);
        System.out.println("Su descuento fue " + descuento);
        System.out.println("Su sueldo total es de " + total);

    }
}
   
