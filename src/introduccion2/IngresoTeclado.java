package introduccion2;

import java.util.Scanner;

public class IngresoTeclado {
	public static void main(String[] arg) {
		
		//opcion1 utilizar el nombre canónico
		//java.util.Scanner tec;
		
		//opcion2: hacer un import
		//Scanner tec;
		
		//opcion3: que nos ayude eclipse
		Scanner tec = new Scanner(System.in);
		
		String nombre;
		
		System.out.print("Ingresa tu nombre:");
		nombre = tec.nextLine();
		
		System.out.println("Hola " + nombre + " qué tal estas?");
		
		
		
	
		
		// if (nombre == "Alejandra")
		if (nombre.equals("Alejandra"))
			System.out.println("Son iguales");
		else 
			System.out.println("SON DIFERENTES");
	}

}
