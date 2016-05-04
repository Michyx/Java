
package ejercicio4;

import java.util.Scanner;
public class Ejercicio4 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num1=0;
        int num2=0;
        int num3=0;
        double promedio = 0;
        int suma = 0;
        int doble = 0;
        int triple= 0;
        int cuadrado= 0;
        System.out.println("Ingrese 3 numeros");
        num1 = read.nextInt();
        num2 = read.nextInt();
        num3 = read.nextInt();
        //Operaciones
        suma = num1+num2+num3;
        promedio = suma/3;
        doble = num1*2;
        triple = num2 *3;
        cuadrado = (int) Math.pow (triple,2);
        
        System.out.println ("La suma de todos los numeros es : "+suma);
        System.out.println ("El promedio de todos los numeros es : "+promedio);
        System.out.println ("El doble del primer numero es : "+doble);
        System.out.println ("El triple del segundo numero es : "+triple);
        System.out.println ("El cuadrado del tercer numero es : "+cuadrado);
        
    }
    
}
