
package ejercicio10;

import java.util.Scanner;
public class Ejercicio10 {

  
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int reprobados;
        int aprobados;
        int  notables;
        int sobresalientes;
        int total;
        System.out.print("Ingrese cantidad de Reprobados: ");
        reprobados = read.nextInt();
        System.out.print("Ingrese cantidad de Aprobados: ");
        aprobados = read.nextInt();
        System.out.print("Ingrese cantidad de Notables: ");
        notables = read.nextInt();
        System.out.print("Ingrese cantidad de Sobresalientes: ");
        sobresalientes = read.nextInt();
        total = reprobados + aprobados + notables + sobresalientes;
        reprobados = reprobados * 100 / total;
        aprobados = aprobados * 100 / total;
        notables = notables * 100 / total;
        sobresalientes = sobresalientes * 100 / total;

        System.out.println("Resultados:");
        System.out.println("");
        System.out.println("Reprobados:      " + reprobados + "%");
        System.out.println("Aprobados:       " + aprobados + "%");
        System.out.println("Notables:        " + notables + "%");
        System.out.println("Sobresalientes:  " + sobresalientes + "%");
     
    }
    
}
