
package ejercicio11;

import java.util.Scanner;
public class Ejercicio11 {

  
    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
     double parciales;
     double talleres;
     double tareas;
     double investigacion;
     double nFinal;
        System.out.print("Ingrese su promedio de Notas Parciales: ");
        parciales = read.nextDouble();
        System.out.print("Ingrese su promedio en Talleres: ");
        talleres = read.nextDouble();
        System.out.print("Ingrese su nota en Exposicion del tema de Investigacion: ");
        investigacion = read.nextDouble();
        System.out.print("Ingrese su promedio en Tareas: ");
        tareas = read.nextDouble();
        parciales *= 0.5;
        talleres *= 0.25;
        tareas *= 0.15;
        investigacion *= 10;
        nFinal = parciales + talleres + tareas + investigacion;
        System.out.println("Su promedio Final es de " + nFinal);
    }
    
}
