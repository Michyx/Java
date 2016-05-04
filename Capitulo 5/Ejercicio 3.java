
package pkg3ejercicios3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1,num2,div;
        long fact=1;
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1=read.nextInt();
        div=0;
        for (num2=2;num2<num1;num2++){
            if (num1%num2==0){
                div++;
            }
        }
        if (div==0){
            System.out.println("El nunero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        //Factorial
        for (num2=1;num2<=num1;num2++){
            System.out.println(fact+"*"+num2);
            fact=fact*num2;
        }
        System.out.println("El factorial del numero es "+fact);
    }
}
    

