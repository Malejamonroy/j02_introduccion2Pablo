package ejercicios;

//Crea un programa que intercambie los valores de dos variables sin usar una variable temporal.

public class Ej02 {
   public static void main(String[] args) {
    // int a = 1;
    // int b = 2;

    int a = 99;
    int b = 10;

    System.out.println("valor inicial");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    a = a + b; //vamos a meter en a = el valor inicial de a y lo sumamaos con el valor inicial de b que nos da a= 1+2 = 3 ahora a vale 3 
    b = a - b; //vamos a meter en b la resta de a(que vale 3) menos b(que vale 2 inicialmete)y esto nos da resultado de 1 que es le valor que quuiero que tenga b , y ya le dimos la vuelta 
    a = a - b; //vamos a meter en a (que vale 3) menos el valor de b (que vale 1) y ya tenemos el resultado de a qeu es 2

    System.out.println("--------------");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
   }

    
}
