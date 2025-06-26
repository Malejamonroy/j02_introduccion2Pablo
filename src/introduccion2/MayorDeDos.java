package introduccion2;

import java.util.Scanner;

//ingresar por teclado dos enteros y mostrar el valor del mayor
public class MayorDeDos {
	public static void main (String[] arg) {
		Scanner tec = new Scanner(System.in);
		
		int n1, n2, mayor;
		
		System.out.print("Ingrese valor: ");
		n1 = tec.nextInt();
		
		System.out.print("Ingrese valor: ");
		n2= tec.nextInt();
		
		
		if (n1 > n2)
			mayor = n1;
		else
			mayor = n2;
		
		// mayor = n1 > n2 ? n1 : n2;
		 
		
		System.out.println("El valor mayor es " + mayor);
	
	}
}
