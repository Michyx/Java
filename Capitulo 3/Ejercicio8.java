
package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {


    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int salario;
        System.out.println("Ingrese su salario actual");
        salario = read.nextInt();
        salario += salario * 0.1;
        System.out.println("El nuevo salario es :" + salario);
        
    }
    
}
