import java.util.Scanner;
import java.util.*;

class Cinco{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int x, i, suma=0;
        char letra;
    do{
        System.out.println("Ingrese la cantidad de productos que compro");
        x = entrada.nextInt();
        for(i = 0;i < x;i++){ 
        System.out.println("Escriba el precio");
        suma = suma + Integer.parseInt(entrada.next());
        }
       
     System.out.println("La suma de los numeros es: "+suma);
     System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
        letra = entrada.next().charAt(0);
    }while(letra == 's'); 
    } 
}