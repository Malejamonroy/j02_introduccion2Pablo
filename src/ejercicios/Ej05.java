package ejercicios;

//Dos números son "amigables" si la suma de los divisores propios de uno es igual al otro. Por
// ejemplo, los divisores propios de 8 son: 1, 2 y 4 y la suma de éstos 1 + 2 + 4 = 7; luego 8 es un
// número amigo de 7. Escribe un método que determine si dos números dados son amigables.
public class Ej05 {
public static void main(String[] args) {
   
int num1 = 5;
int num2 = 9;
int numMayor= 0;
int numMenor= 0;
int sumDivisores = 0;

if( num1 > num2){
    numMayor = num1;
    numMenor = num2;
} else{ 
    numMayor = num2;
    numMenor = num1;
}
for (int i= 1;i< numMayor;i++){
    if(numMayor%i==0){
        sumDivisores +=i;
    }
}
if(sumDivisores == numMenor){
    System.out.println("son amigables");
}else{
    System.out.println("son enemigos");
}

}




}
