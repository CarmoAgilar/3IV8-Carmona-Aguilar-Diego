import java.util.Scanner; 
import java.util.*;

class Seis{

    public static void main(String[] args){ 

        Scanner entrada = new Scanner(System.in); 
        int base, altura, opcion, lado; 
        char letra; 
        double resultado; 
    do{ 
        System.out.println("Elija la opcion deseada: ");

        System.out.println("1.- Calcular el area de un cuadrado "); 
        System.out.println("2.- Calcular el perimetro de un cuadrado "); 
        System.out.println("3.- Calcular el area de un triangulo "); 
        System.out.println("4.- Calcular el perimetro de un triangulo "); 
        System.out.println("5.- Calcular el volumen de una esfera "); 
        System.out.println("6.- Calcular el volumen de un cilindro ");  
        System.out.println("7.- Salir "); 
        opcion = entrada.nextInt(); 

        switch (opcion) { 

            case 1: 

                System.out.println("Ingrese la base del rectangulo"); 
                base = entrada.nextInt(); 
                System.out.println("Ingrese la altura del rectangulo"); 
                altura = entrada.nextInt(); 
                resultado = base*altura; 
                System.out.println("El area del rectangulo es de: "+resultado); 

                break; 

            case 2: 
                System.out.println("Ingrese la base del rectangulo"); 
                base = entrada.nextInt(); 
                System.out.println("Ingrese la altura del rectangulo"); 
                altura = entrada.nextInt(); 
                resultado = altura+base+base+altura; 
                System.out.println("El perimetro del rectangulo es de: "+resultado); 
                break; 

            case 3: 
                System.out.println("Ingresa el valor de la base"); 
                base = entrada.nextInt(); 
                System.out.println("Ingresa el valor de la altura"); 
                altura = entrada.nextInt(); 
                resultado = (base*altura)/2; 
                System.out.println("El area del triangulo es de: "+resultado); 
                break; 

            case 4: 
                System.out.println("Ingresa el 1er lado");
                base = entrada.nextInt();
                System.out.println("Ingresa el 2do lado");
                altura = entrada.nextInt();
                System.out.println("Ingresa el 3er lado"); 
                lado = entrada.nextInt(); 
                resultado = base+altura+lado; 
                System.out.println("El perimetro del triangulo es de: "+resultado); 
                break;   

            case 5: 
                System.out.println("Ingresa el valor del radio"); 
                base = entrada.nextInt();
                resultado = 3.1416*0.75*base*base*base;
                System.out.println("El area del circulo es de: "+resultado); 
                break; 

            case 6: 

                System.out.println("Ingresa el valor del radio"); 
                base = entrada.nextInt(); 
                System.out.println("Ingresa la altura");
                altura = entrada.nextInt();
                resultado = (base*base*3.1416)*altura;
                System.out.println("El volumen del cilindro es de: "+resultado); 

                break; 
            default: 
                System.out.println("Gracias");        

        }

        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
        letra = entrada.next().charAt(0); 

    }while(letra == 's'); 

         

    }
}