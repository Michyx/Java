
package pkg3ejercicio6;

import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num,z;
        int[] equipo,premioEquipo;
        equipo = new int[3];
        equipo[0]= 0;
        equipo[1]= 0;
        equipo[2]= 0;
        premioEquipo = new int[3];
        premioEquipo[0]=0;
        premioEquipo[1]=0;
        premioEquipo[2]=0;
        for (num = 0; num < 10; num++) {
            System.out.println("Ingrese de que equipo fue el puesto Nº" + (num+1)+" (1/2/3)");
            z=read.nextInt();
            equipo[z-1]++;
            if((num+1)==1){
                premioEquipo[z-1]+=100000;
            }else if(num+1==2){
                premioEquipo[z-1]+=80000;
            }else if(num+1==3){
                premioEquipo[z-1]+=60000;
            }else if(num+1>=4 && num+1<=6){
                premioEquipo[z-1]+=40000;
            }else if(num+1>=7 && num+1<=10){
                premioEquipo[z-1]+=20000;
            }
        }
        System.out.println("La cantidad de corredores entre los 10 primeros puestos de cada equipo son");
        System.out.println("Equipo 1 =  "+equipo[0]);
        System.out.println("Equipo 2 =  "+equipo[1]);
        System.out.println("Equipo 3 =  "+equipo[2]);
        System.out.println("Los premios recibidos por equipo son : ");        
        System.out.println("Equipo 1 =  "+premioEquipo[0]);
        System.out.println("Equipo 2 =  "+premioEquipo[1]);
        System.out.println("Equipo 3 =  "+premioEquipo[2]);
        
    }

    }
    

