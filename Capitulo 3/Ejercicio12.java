
package ejercicio12;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
        double presupuesto;
        double kinesiologia;
        double ginecologia;
        double traumatologia;
        double pediatria;
        System.out.print("Ingrese el presupuesto anual: ");
        presupuesto = read.nextDouble();
        kinesiologia = presupuesto * 0.2;
        ginecologia = presupuesto * 0.25;
        traumatologia = presupuesto * 0.3;
        pediatria = presupuesto * 0.25;
        System.out.println("Los presupuestos son :");
        System.out.println("___________________________");
        System.out.println("Kinesiologia......$" + (int) kinesiologia);
        System.out.println("Ginecologia.......$" + (int) ginecologia);
        System.out.println("Traumatologia.....$" + (int) traumatologia);
        System.out.println("Pediatria.........$" + (int) pediatria);

    }
    
}
