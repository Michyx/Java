
package pkg3ejercicio4;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        double notas, sumaNotas = 0, promedio, aprobadas = 0, reprobadas = 0, alta = 0, baja = 10, salir = 1, cont = 0;
        boolean pasa;
        System.out.println("Ingrese notas del alumno (Cuando desee terminar, ingrese -1");
        do {
            System.out.print("- ");
            notas = read.nextDouble();
            if (notas==-1){
                break;
            }
            if (notas > alta) {
                alta = notas;
            } else if (notas < baja) {
                baja = notas;
            }
            if (notas < 4) {
                reprobadas++;
            } else if (notas >= 4) {
                aprobadas++;
            }
            sumaNotas += notas;
            cont++;
        } while (salir != 0);
        promedio = sumaNotas / cont;

        pasa = (promedio >= 4 && (reprobadas * 100 / cont) < 50);

        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("La cantidad de notas aprobadas fue de: " + (int)aprobadas);
        System.out.println("La cantidad de notas reprobadas fue de: " + (int)reprobadas);
        System.out.println("La mejor nota fue: " + alta);
        System.out.println("Y la peor fue: " + baja);
        if (pasa){
            System.out.println("El alumno aprobo la materia");
        }else{
            System.out.println("El alumno reprueba la materia");
        }
    }
}
    
    

