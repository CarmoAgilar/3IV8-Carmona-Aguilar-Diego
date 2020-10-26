import java.util.Scanner;
import java.util.*;

class Nueve{

    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);
        int base, altura, opcion;
        char letra;
        double resultado;

        do{
        System.out.println("Escriba el primer numero:");
        base = entrada.nextInt();

        System.out.println("Escriba el segundo numero:");
        altura = entrada.nextInt();

        System.out.println("1.- Para sumar:");
        System.out.println("2.- Para restar:");
        System.out.println("3.- Para multiplicar:");
        System.out.println("4.- Para dividir:");

        opcion = entrada.nextInt();
        switch (opcion){
        case 1:
            resultado = base+altura;
            System.out.println("El resultado es: "+resultado);
            break;
        case 2:
            resultado = base-altura;
            System.out.println("El resultado es: "+resultado);
            break;     
        case 3:
            resultado = base*altura;
            System.out.println("El resultado es: "+resultado);
            break;
        case 4:
            resultado = base/altura;
            System.out.println("El resultado es: "+resultado);
            break;
            default:
                System.out.println("Elija una opcion valida");
        }



            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
            letra = entrada.next().charAt(0);

        }while(letra == 's');


    }
   

}