import java.util.Scanner;
import java.util.*;

class Dos{
 
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int base;
        String binario = "";
        char letra;
        
     do{
        System.out.println("Ingrese un número en el sistema decimal positivo");
        base = entrada.nextInt();
        
        
            if (base > 0) {
                while (base > 0) {
                    if (base % 2 == 0) {
                        binario = "0" + binario;
                    } else {
                        binario = "1" + binario;
                    }
                    base = (int) base / 2;
                }
            } else if (base == 0) {
                binario = "0";
            } else {
                binario = "Ingrese solo números positivos";
            }
            System.out.println("Binario: " + binario);
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
        letra = entrada.next().charAt(0);
    }while(letra == 's'); 
    }
}