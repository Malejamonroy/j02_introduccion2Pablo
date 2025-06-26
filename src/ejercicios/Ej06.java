package ejercicios;

import java.util.Scanner;

// Simula el lanzamiento de un dado de 6 caras utilizando números aleatorios.

public class Ej06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String repetir = "s";


        while(repetir.equals("s")){
            int numAleatorio = (int)(Math.random()*6)+1;
            System.out.println(numAleatorio);
            System.out.println("Desea lanzar de nuevo? ");
            repetir = teclado.nextLine();
            
        }
        teclado.close();
    }

    
}
