
package ejercicio1;

import java.text.NumberFormat;
import java.util.Scanner;
public class Ejercicio1 {


    public static void main(String[] args) {
       //Calculo de cilindo
       double radio = 0.0;
       double altura = 0.0;
       double pi = 3.14;
       Scanner read = new Scanner (System.in);
       System.out.println("Para calcular el volumen y el area del cilindro");
       System.out.println("Ingresa el radio");
       radio = read.nextDouble();
       System.out.println("Ingrese la altura de su cilindro");
       altura = read.nextDouble();

       
       double area_base = pi * (double)Math.pow(radio,2);
       double area_total = 2 * pi * radio * (radio+altura);
       double volumen = pi * (double) Math.pow(radio,2)* altura;
       
       System.out.println ("El area total del cilindro es : "+area_total);
        System.out.println ("El volumen del cilindro es : "+volumen );
    }
    
}
