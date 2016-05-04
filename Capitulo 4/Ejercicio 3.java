
package pkg2ejercicio3;

import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        double nota;
        do {
            System.out.println("Ingrese nota");
            nota = read.nextDouble();
            if (nota > 1 && nota < 4) {
                System.out.println("Nota Insuficiente");
            } else if (nota >= 4 && nota < 5) {
                System.out.println("Nota Suficiente");
            } else if (nota >= 5 && nota < 6) {
                System.out.println("Nota Buena");
            } else if (nota >= 6 && nota <= 7) {
                System.out.println("Nota Muy Buena");
            } else {
                System.out.println("Nota ingresada incorrecta");
            }
        }while(nota<1 || nota>7);
    }
    
}
