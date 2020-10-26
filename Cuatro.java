import java.util.Scanner; 
import java.util.*;

class Cuatro{ 

    public static void main(String arg[]){
         
    Scanner entrada = new Scanner(System.in);
    int base, altura, lado, edad, x;
    char letra;

        do{

            System.out.println("Introduzca 5 bumeros");
            System.out.println("Introduzca el primero:");
            base = entrada.nextInt();
            
            System.out.println("Introduzca el segundo:");
            altura = entrada.nextInt();
            
            System.out.println("Introduzca el tercero:");
            lado = entrada.nextInt();
            
            System.out.println("Introduzca el cuarto:");
            edad = entrada.nextInt();
            
            System.out.println("Introduzca el quinto:");
            x = entrada.nextInt();
            
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;
            
            if ( base > 0)
            positivos = positivos + 1;
            
            if ( base < 0)
            negativos = negativos + 1;
            
            if ( 0 == base)
            ceros = ceros + 1;
            
            if ( altura > 0)
            positivos = positivos + 1;
            
            if ( altura < 0)
            negativos = negativos + 1;
            
            if ( 0 == altura)
            ceros = ceros + 1;
            
            if ( lado > 0)
            positivos = positivos + 1;
            
            if ( lado < 0)
            negativos = negativos + 1;
            
            if ( 0 == lado)
            ceros = ceros + 1;
            
            if ( edad > 0)
            positivos = positivos + 1;
            
            if ( edad < 0)
            negativos = negativos + 1;
            
            if ( 0 == edad)
            ceros = ceros + 1;
            
            if ( x > 0)
            positivos = positivos + 1;
            
            if ( x < 0)
            negativos = negativos + 1;
            
            if ( 0 == x)
            ceros = ceros + 1;
    
        System.out.println(positivos+" son positivos, "+negativos+" son negativos y "+ceros+" son ceros");

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
            letra = entrada.next().charAt(0);

        }while(letra == 's');
    }
}
    