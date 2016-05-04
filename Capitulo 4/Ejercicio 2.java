
package pkg2ejercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int dinero, veinteMil, diezMil, cincoMil, dosMil, mil, quin, cien, cincu, diez, cinco, uno;
        System.out.println("Ingrese el monto dinero");
        dinero = read.nextInt();
        veinteMil = (int) (dinero / 20000);
        diezMil = (int) ((dinero % 20000) / 10000);
        cincoMil = (int) ((dinero % 10000) / 5000);
        dosMil = (int) ((dinero % 5000) / 2000);
        mil = (int) ((dinero % 2000) / 1000);
        quin = (int) ((dinero % 1000) / 500);
        cien = (int) ((dinero % 500) / 100);
        cincu = (int) ((dinero % 100) / 50);
        diez = (int) ((dinero % 50) / 10);
        cinco = (int) ((dinero % 10) / 5);
        uno = (int) (dinero % 5);
        System.out.println(veinteMil + " Billetes de $20000");
        System.out.println(diezMil + " Billetes de $10000");
        System.out.println(cincoMil + " Billetes de $5000");
        System.out.println(dosMil + " Billetes de $2000");
        System.out.println(mil + " Billetes de $1000");
        System.out.println(quin + " Monedas de $500");
        System.out.println(cien + " Monedas de $100");
        System.out.println(cincu + " Monedas de $50");
        System.out.println(diez + " Monedas de $10");
        System.out.println(cinco + " Monedas de $5");
        System.out.println(uno + " Monedas de $1");
    }
}

    

  