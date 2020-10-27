import java.util.Scanner;
import java.util.*;
//importar escaner
class Pokedex{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int opcion, opcion2, opcion3, num, atk;
        char letra;
        //Aqui estan la variables
        do{   
        //el "do" es para preguntar si desea volver al menu
        System.out.println("    ");
        System.out.println("Esto fue hecho por Carmona Aguilar Diego");
        System.out.println("    ");
        System.out.println("Grupo: 3IV8");
        System.out.println("    ");
        System.out.println("Que quiere hacer?");
        System.out.println("1.- Ver datos de Charmander");
        System.out.println("2.- Ver datos de Bulbasaor");
        System.out.println("3.- Ver datos de Squartle");
        System.out.println("4.- Combate poquemon");
        System.out.println("5.- Salir");
        //aqui se elige la opcion deseada 
        opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                System.out.println("\tID\tNombre\t\tVida\tAtaque principal\tAtaque secundario");
                System.out.println("\t1\tCharmande\t100\tBola de fuego\t\tGarra de fuego");
                //datos de charmander
            break;

            case 2:
                System.out.println("\tID\tNombre\t\tVida\tAtaque principal\tAtaque secundario");
                System.out.println("\t2\tBulbasaor\t120\tBola de planta\t\tAtaque semilla");
                //datos de Bulbasor
            break;
            case 3:
                System.out.println("\tID\tNombre\t\tVida\tAtaque principal\tAtaque secundario");
                System.out.println("\t3\tSquartle\t100\tBola de agua\t\tChorro de agua");
                //datos de la ardilla
            break;
            case 4:
            //se elige al pokemon con el que se quiere ppeelear
                    System.out.println("Elija su pokemon");
                    System.out.println("1.- Charmander");
                    System.out.println("2.- Bulbasaor");
                    System.out.println("3.- Squartle");
                    opcion2 = entrada.nextInt();

                //no hay presupuesto para hacer una batalla real

                    switch(opcion2){
                        case 1:
                            System.out.println("Has elejido a Charmander");
                            System.out.println("    ");
                            System.out.println("elige un numero real cualquiera");
                            num = entrada.nextInt();

                            if(num >20){
                                System.out.println("Tu oponente es bulbasor");
                                System.out.println("que quieres hacer");
                                System.out.println("1.- Huir");
                                System.out.println("2.- Escapar");
                                System.out.println("1.- Correr");

                                opcion3 = entrada.nextInt();

                                System.out.println("Elegiste huir");



//Se repite el codigo para la eleccion de los 3 pokemones
                            }
                            else{
                                System.out.println("Tu oponente es charmander");

                                System.out.println("que quieres hacer");
                                System.out.println("1.- Huir");
                                System.out.println("2.- Escapar");
                                System.out.println("1.- Correr");

                                opcion3 = entrada.nextInt();

                                System.out.println("Elegiste huir");

                            


                            }

                            

                        break;
                        case 2:
                            System.out.println("Has elejido a Bulbasor");
                            System.out.println("    ");
                            System.out.println("elige un numero real cualquiera");
                            num = entrada.nextInt();

                            if(num >20){
                                System.out.println("Tu oponente es bulbasor");
                                System.out.println("que quieres hacer");
                                System.out.println("1.- Huir");
                                System.out.println("2.- Escapar");
                                System.out.println("1.- Correr");

                                opcion3 = entrada.nextInt();

                                System.out.println("Elegiste huir");




                            }
                            else{
                                System.out.println("Tu oponente es charmander");
                                
                                System.out.println("que quieres hacer");
                                System.out.println("1.- Huir");
                                System.out.println("2.- Escapar");
                                System.out.println("1.- Correr");

                                opcion3 = entrada.nextInt();

                                System.out.println("Elegiste huir");

                            


                            }

                        break;
                        case 3:
                        System.out.println("Has elejido a squartle");
                        System.out.println("    ");
                        System.out.println("elige un numero real cualquiera");
                        num = entrada.nextInt();

                        if(num >20){
                            System.out.println("Tu oponente es bulbasor");
                            System.out.println("que quieres hacer");
                            System.out.println("1.- Huir");
                            System.out.println("2.- Escapar");
                            System.out.println("1.- Correr");

                            opcion3 = entrada.nextInt();

                            System.out.println("Elegiste huir");




                        }
                        else{
                            System.out.println("Tu oponente es charmander");
                            
                            System.out.println("que quieres hacer");
                            System.out.println("1.- Huir");
                            System.out.println("2.- Escapar");
                            System.out.println("1.- Correr");

                            opcion3 = entrada.nextInt();

                            System.out.println("Elegiste huir");

                        


                        }

                        break;
                        default:

                }

            break;
            case 5:
            System.out.println("Gracias por participar");
            break;
            default:
            //si se escribe un numero diferente, viene a esta parte donde se le pide que no ponga tonterias
            System.out.println("Elija una opcion valida");

        }

        System.out.println("¿Deseas volver al menu?, si lo desea escriba s"); 
                letra = entrada.next().charAt(0);    
        }while(letra == 's');
//while para repetir todo si asi lo elige 
    
    } 
}