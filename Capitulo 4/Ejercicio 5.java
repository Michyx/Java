
package pkg2ejercicio5;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
         int auxiliar;
        do {
            int hExtras, pago_extras = 0, sueldoBase = 0, grado, isapre, afp, total, descuento = 0;
            System.out.println("Ingrese sus horas trabajadas");
            hExtras = read.nextInt();
            System.out.println("Ingrese su grado");
            grado = read.nextInt();
            System.out.println("Ingrese su ISAPRE");
            System.out.println("(1)Colmena");
            System.out.println("(2)BanMedica");
            System.out.println("(3)Vida 3");
            System.out.println("(4)Fonasa");
            isapre = read.nextInt();
            System.out.println("Ingrese su AFP");
            System.out.println("(1)BanSander");
            System.out.println("(2)Geometrica SA");
            System.out.println("(3)Cumprum");
            System.out.println("(4)Provida");
            afp = read.nextInt();

            hExtras -= 40;
            if (hExtras > 0) {
            } else if (hExtras >= 1 && hExtras <= 3) {
                pago_extras = hExtras * 2000;
            } else if (hExtras >= 4 && hExtras <= 7) {
                pago_extras = hExtras * 3000;
            } else if (hExtras > 7) {
                pago_extras = hExtras * 3500;
            } else {
                pago_extras = 0;
            }
            switch (grado) {
                case 1:
                    sueldoBase = 450000;
                case 2:
                    sueldoBase = 550000;
                case 3:
                    sueldoBase = 700000;
            }
            switch (isapre) {
                case 1:
                    descuento = (int) (sueldoBase * 0.065);
                case 2:
                    descuento = (int) (sueldoBase * 0.073);
                case 3:
                    descuento = (int) (sueldoBase * 0.07);
                case 4:
                    descuento = (int) (sueldoBase * 0.07);
            }
            switch (afp) {
                case 1:
                    descuento += (int) (sueldoBase * 0.12);
                case 2:
                    descuento += (int) (sueldoBase * 0.134);
                case 3:
                    descuento += (int) (sueldoBase * 0.123);
                case 4:
                    descuento += (int) (sueldoBase * 0.129);
            }
            total = sueldoBase + pago_extras - descuento;
            System.out.println("");
            for (int i = 0; i < 150; i++) {
                System.out.println();
            }
            System.out.println("El sueldo final es de $" + total);
            System.out.println("");
            System.out.println("Si desea terminar de comprobar sueldos, ingrese 0");
            System.out.println("Si no, ingrese 1");
            auxiliar=read.nextInt();
            for (int i = 0; i < 150; i++) {
                System.out.println();
            }
        } while (auxiliar != 0);
    }
}
    
    

