
package ejercicio6;

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);
        int total = 0;
        int producto = 0;
        int[] num_producto;
        num_producto = new int[6];
        num_producto[0] = 690;
        num_producto[1] = 890;
        num_producto[2] = 990;
        num_producto[3] = 1100;
        num_producto[4] = 700;
        num_producto[5] = 500;
        System.out.println("Ingrese el producto");
        System.out.println("(1)Completo italiano" + "     " + "$" + num_producto[0] );
        System.out.println("(2)Completo a la chilena" + " " + "$" + num_producto[1] );
        System.out.println("(3)Hamburgesa Queso" + "      " + "$" + num_producto[2] );
        System.out.println("(4)Churrasco" + "             " + "$" + num_producto[3] );
        System.out.println("(5)Cerveza" + "               " + "$" + num_producto[4] );
        System.out.println("(6)Bebida" + "                " + "$" + num_producto[5] );
        System.out.println("(0)Terminar" + "                      " );
        while (producto == 0 && producto >= 0) {
            producto = read.nextInt();
            switch (producto) {
                case 1:
                    total += num_producto[0];
                    break;
                case 2:
                    total += num_producto[1];
                    break;
                case 3:
                    total += num_producto[2];
                    break;
                case 4:
                    total += num_producto[3];
                    break;
                case 5:
                    total += num_producto[4];
                    break;
                case 6:
                    total += num_producto[5];
                    break;
            }
        }
        System.out.println("La cuenta es de : " + (int) (total - (total * 0.19)));
    }
}