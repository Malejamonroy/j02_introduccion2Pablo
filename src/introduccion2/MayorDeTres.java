package introduccion2;

import java.util.Scanner;

public class MayorDeTres {
	public static void main(String[] arg) {
		Scanner tec = new Scanner(System.in);
		
		int n1,n2,n3, mayor;
		
		System.out.print("Ingrese valor: ");
		n1 = tec.nextInt();
		
		System.out.print("Ingrese valor: ");
		n2 = tec.nextInt();
		
		System.out.print("Ingrese valor: ");
		n3 = tec.nextInt();
		
		if (n1 > n2) 
			mayor = n1;
			else mayor = n2;
		
		if (n3 > mayor)
			mayor = n3;
		
//		otra opcion 
		
//		if (n1 > n2 && n1 > n3)
//			mayor = n1;
//		
//		else 
//			if(n2 > n1 && n2 > n3)
//				mayor = n2;
//			else
//				mayor = n3;
		
//		otra opcion 
		
//		if (n1 >= n2 && n1 >= n3)
//			mayor = n1;
//		
//		else if(n2 >= n3)
//				mayor = n2;
//			else
//				mayor = n3;
		
		
		
		
			
		
		System.out.println("El valor mayor es " + mayor);
		
	
		
		

	}

}
