
package pkg3ejercicio2;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
   int azar,x,z,acertados=0;
        int[] loteria;
        loteria=new int[7];
        int[] numerosJugador;
        numerosJugador=new int[7];
        for (x=0;x<7;x++){
            azar=(int) Math.floor(Math.random()*41);
            loteria[x]=azar;
        }
            System.out.println("Ingrese sus numeros");
        for (x=0;x<6;x++){
            numerosJugador[x]=read.nextInt();
        }
        for (x=0;x<7;x++){
            for (z=0;z<6;z++){
                if (loteria[x]==numerosJugador[z]){
                    acertados++;
                }
            }
        }
        System.out.println("Los numeros ganadores Son:");
        for (x=0;x<7;x++){
            System.out.println(loteria[x]);
        }
        System.out.print("Acertaste a "+acertados+" : ");
        if (acertados==6){
            System.out.println("Has ganado el LOTTO");
        }else{
            if(acertados==5){
                System.out.println("Ganaste la Quina");
            }else{
                if(acertados==4){
                    System.out.println("Ganasa Cuartena");
                }else{
                    if(acertados==3){
                        System.out.println("Ganaste la Terna");
                    }else{
                        System.out.println("No ganaste nada (Jajajaja)");
                    }
                }
            }
        }
    }
}