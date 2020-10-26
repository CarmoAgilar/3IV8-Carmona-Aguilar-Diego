import java.util.Scanner; 
import java.util.*;

class Uno{
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int edad, opcion; 
        double abono;
        char letra;
    do{

        System.out.println("Escribe tu edad: "); 
        edad = entrada.nextInt();
        System.out.println("Escribe el precio de tu abono: "); 
        abono = entrada.nextDouble();
        
       if (edad > 65){
            abono = abono*0.6;
            System.out.println("Debes pagar: "+abono);
        }
        if(21 < edad & edad < 65){
            System.out.println("Debes pagar: "+abono);
        }
        if (edad < 21){
           System.out.println("Si tus padres son socios selecciona 1. O si no lo son, preciona 2.");

           opcion = entrada.nextInt();

            switch (opcion){
                case 1: 
                abono = abono*.55;
                System.out.println("El total a pagar es:"+abono);

                break;
                case 2:
                abono = abono*.75;
                System.out.println("El total a pagar es: "+abono);
                break;
                default:
               
            }

        }
               System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
        letra = entrada.next().charAt(0);    
    }while(letra == 's');
    }
}