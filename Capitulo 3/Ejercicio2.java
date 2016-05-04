
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

 
     
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);
       int num1 = 0;
       int num2 = 0;
       System.out.println ("Para comenzar, ingrese 2 numeros");
        System.out.println ("Primer numero");
        num1 = read.nextInt();
         System.out.println ("Segundo numero");
         num2 = read.nextInt();
         int suma = num1+num2;
         int multi = num1*num2;
         System.out.println ("La suma de los 2 numeros es : "+suma);
            System.out.println ("La multiplicacio de los 2 numeros es : "+multi);
       
    }
    
}
