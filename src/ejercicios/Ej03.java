package ejercicios;

//Escribe un método que retorne la suma de los dígitos de un número entero (ejemplo: 1234 -> 1+2+3+4 = 10).

public class Ej03 {
    public static void main(String[] args) {
        int num = 1234;
        int sumaDigitos = 0;
        
       while(num > 0){
        sumaDigitos += num % 10;
        num = num /10;

       }
       System.out.println(sumaDigitos);
    

    }
    
}
