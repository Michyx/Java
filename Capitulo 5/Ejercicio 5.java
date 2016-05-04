
package pkg3ejercicio5;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int[] base, num2;
        String[] num1, tipoBase;
        int cantIngredientes = 0, x, costo = 0, z;
        base = new int[4];
        base[0] = 400;
        base[1] = 350;
        base[2] = 250;
        base[3] = 350;
        tipoBase = new String[4];
        tipoBase[0] = "Churrasco";
        tipoBase[1] = "Lomo de Cerdo";
        tipoBase[2] = "Ave";
        tipoBase[3] = "Atun";
        num1 = new String[11];
        num1[0] = "Lechuga";
        num1[1] = "Tomate";
        num1[2] = "Champignon";
        num1[3] = "Palta";
        num1[4] = "Palmitos";
        num1[5] = "Queso";
        num1[6] = "Tocino ";
        num1[7] = "Jamon";
        num1[8] = "Huevo Frito";
        num1[9] = "Cebolla";
        num1[10] = "";
        num2 = new int[11];
        num2[0] = 0;
        num2[1] = 0;
        num2[2] = 0;
        num2[3] = 0;
        num2[4] = 0;
        num2[5] = 0;
        num2[6] = 0;
        num2[7] = 0;
        num2[8] = 0;
        num2[9] = 0;
        num2[10] = 0;

        System.out.println("Bienvenido!");
        System.out.println("De que quiere su sandwich?");
       
        System.out.println("(1)Churrasco             $400");
        System.out.println("(2)Lomo de cerdo         $350");
        System.out.println("(3)Ave                   $250");
        System.out.println("(4)Atun                  $350");
      
        System.out.print("- ");

        x = read.nextInt();
        costo += base[x - 1];
        System.out.println("Elija sus num1");
        do {
            
            System.out.println("(1)Lechuga  | (2)Tomate   | (3)Champignon  |");
            System.out.println("(4)Palta    | (5)Palmitos | (6)Queso       |");
            System.out.println("(7)Tocino   | (8)Jamon    | (9)Huevo Frito |");
            System.out.println("(10)Cebolla | (11)Salir   |                |");
            
            System.out.print("- ");

            z = read.nextInt();
            if (z <= 11) {
                if (num2[z - 1] > 0) {
                    System.out.println("Ingrediente ya utilizado");
                } else if (z < 11) {
                    num2[z - 1]++;
                    cantIngredientes++;
                } else if (z < 1 && z > 11) {
                    System.out.println("Opcion incorrecta");
                }
            }

        } while (z != 11);
        if (cantIngredientes <= 3) {
            costo += cantIngredientes * 150;
        } else if (cantIngredientes > 3 && cantIngredientes <= 5) {
            costo += cantIngredientes * 120;
        } else if (cantIngredientes > 5) {
            costo += cantIngredientes * 100;
        }
        
        System.out.println("Su sandwich de base: " + tipoBase[x]);
        System.out.println("Con los num1:");
        for (x = 0; x < 11; x++) {
            if (num2[x] > 0) {
                System.out.println("- " + num1[x]);
            }
        }
        System.out.println("Tendra un valor total de $" + costo);
        

    }
}
    
    

