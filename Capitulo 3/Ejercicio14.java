
package ejercicio14;

import java.util.Scanner;
public class Ejercicio14 {

    
    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
        int[] num2;
        num2=new int[3];
        int count,num1=0;
        
        for(count=0;count<3;count++){
            System.out.println("Ingrese la cantidad de dinero que aporta el amigo Nº"+(count+1));
            num2[count]=read.nextInt();
            num1+=num2[count];
        }
        System.out.println("");
        for(count=0;count<3;count++){
            System.out.println("El porcentaje aportado por el amigo Nº"+(count+1)+" Es del %"+(num2[count]*100/num1));
        }
        System.out.println("El total de dinero aportado es de $"+num1 );
    }
    
}
