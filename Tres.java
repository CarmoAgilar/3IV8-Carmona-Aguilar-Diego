import java.util.Scanner;
import java.util.*;

class Tres{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int opcion, base;
        double resultado;
        char letra;
        do{

            System.out.println("Elija la opcion deseada: ");

            System.out.println("1.- Fahrenheit a Celcius"); 
            System.out.println("2.- Fahrenheit a Kelvin"); 
            System.out.println("3.- Fahrenheit a Rankine "); 
            System.out.println("4.- Celcius a Fahrenheit"); 
            System.out.println("5.- Celcius a Kelvin");  
            System.out.println("6.- Celcius a Rankine"); 
            System.out.println("7.- Kelvin a Fahrenheit");
            System.out.println("8.- Kelvin a Celcius");
            System.out.println("9.- Kelvin a Rankine");
            System.out.println("10.- Rankine a Fahrenheit");
            System.out.println("11.- Rankine a Celcius");
            System.out.println("12.- Rankine a Kelvin");
            System.out.println("13.- Ir al final");
            opcion = entrada.nextInt(); 

            switch (opcion) { 
    
                case 1: 

                    System.out.println("Ingrese los grados Fahrenheit");
                    base = entrada.nextInt();

                    resultado = ((base-32)*(5))/9;
                    System.out.println(resultado+" Grados Celcius");
                    
    
                    break; 
    
                case 2: 

                    System.out.println("Ingrese los grados Fahrenheit");
                    base = entrada.nextInt();

                    resultado = ((base-32)*(5))/9+273.15;
                    System.out.println(resultado+" Grados Kelvin");
                     
                    break; 
    
                case 3: 
                   
                    System.out.println("Ingrese los grados Fahrenheit");
                    base = entrada.nextInt();

                    resultado = base+459.67;
                    System.out.println(resultado+" Grados Rankine");

                    break; 
    
                case 4: 
                    
                    System.out.println("Ingrese los grados Celcius");
                    base = entrada.nextInt();

                    resultado = ((base*9)/5)+32;
                    System.out.println(resultado+" Grados Fahrenheit");

                    break;   
    
                case 5: 

                    System.out.println("Ingrese los grados Celcius");
                    base = entrada.nextInt();

                    resultado = base+273.15;
                    System.out.println(resultado+" Grados Kelvin");
                    break; 
    
                case 6: 
                    
                    System.out.println("Ingrese los grados Celcius");
                    base = entrada.nextInt();

                    resultado = ((base*9)/5)+32+459.67;
                    System.out.println(resultado+" Grados Rankine");
                     
    
                    break;
                case 7:
                
                    System.out.println("Ingrese los grados Kelvin");
                    base = entrada.nextInt();

                    resultado = ((base-273.15)*9)/5+32;
                    System.out.println(resultado+" Grados Fahrenheit");
                    break;
                case 8:
                
                    System.out.println("Ingrese los grados Kelvin");
                    base = entrada.nextInt();

                    resultado = base-273.15;
                    System.out.println(resultado+" Grados Celcius");
                    break;
                case 9:
                
                    System.out.println("Ingrese los grados Kelvin");
                    base = entrada.nextInt();

                    resultado = (((base-273.15)*9)/5)+491.67;
                    System.out.println(resultado+" Grados Rankine");
                    break;
                case 10:
                
                    System.out.println("Ingrese los grados Rankine");
                    base = entrada.nextInt();

                    resultado = base-459.67;
                    System.out.println(resultado+" Grados Fahrenheit");

                    break;
                case 11:
                
                    System.out.println("Ingrese los grados Rankine");
                    base = entrada.nextInt();

                    resultado = ((base-32-459.67)*5)/9;
                    System.out.println(resultado+" Grados Celcius");
                    break;
                case 12:
                
                    System.out.println("Ingrese los grados Rankine");
                    base = entrada.nextInt();

                    resultado = (((base-32-459.67)*5)/9)+273.15;
                    System.out.println(resultado+" Grados Kelvin");
                break;

                default: 
            }
            System.out.println("¿Deseas repetir el programa?, si lo desea escriba s"); 
            letra = entrada.next().charAt(0);

        }while(letra == 's'); 
    }
}