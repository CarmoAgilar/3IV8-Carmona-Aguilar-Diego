import java.util.Scanner;

//Importar al scaner

public class Padre{


    //Metodo principal

    //El encapsulamiento esta e la clase Coordenada
    //El manejo de excepciones tambien esta en la clase JuegoBuscaminas

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        char letra;

        //Bucle para reperir cuando pierdes o ganas
        do{

        System.out.println("\nEl juego se jugara por turnos, un jugador elige una casilla y pasa al siguiente turno.\nEl que explote una mina en su turno, pierde.\n");

        //Llamar a la clase Juego Buscaminas
        JuegoBuscaminas ob = new JuegoBuscaminas();

        //Llamar al metodo
        ob.run();

        System.out.println("\nDeseas repetir?, si lo desea escriba s");
        letra = entrada.next().charAt(0);    
        }while(letra == 's');

    }
}