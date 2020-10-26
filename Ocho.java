import java.util.Scanner;
import java.util.*;

class Ocho{

    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            long factorial=1;
            int num;
            char letra;
        do{    
            System.out.print("Introduce un numero: ");
            num = entrada.nextInt();
            for (int r = num; r > 0; r--) {
                factorial = factorial*r;
            }
            System.out.println("El factorial de "+num+" es: " +factorial);

            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
            letra = entrada.next().charAt(0);

        }while(letra == 's');
    }
}