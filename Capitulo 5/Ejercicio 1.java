
package pkg3ejercicio1;
import java.util.Scanner;
public class Main {

 
    public static void main(String[] args) {
       Scanner read = new Scanner (System.in);  
       int x1,x2,y1,y2,m;
        
      
        //Dificil.............
        System.out.println("Ingrese x1");
        x1=read.nextInt();
        System.out.println("Ingrese x2");
        x2=read.nextInt();
        System.out.println("Ingrese y1");
        y1=read.nextInt();
        System.out.println("Ingrese y2");
        y2=read.nextInt();
        
        m=(x2-x1)/(y2-y1);
        System.out.println(m);
        System.out.println(m+"x+"+"y+"+(-y1+(m*-x1*-1)));

    }
}
