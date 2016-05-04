
package pkg2ejercicio1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int x,num1,mayor=0;
        System.out.println("Ingrese 4 num1eros");
        for(x=0;x<4;x++){
            num1=read.nextInt();
            if (num1>mayor){
                mayor=num1;
            }
        }
        System.out.println("El mayor es: "+mayor);
    }
}