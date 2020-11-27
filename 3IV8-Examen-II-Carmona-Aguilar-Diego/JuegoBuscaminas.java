import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoBuscaminas {


    Scanner entrada = new Scanner(System.in);

    //Tablero es privado
    private Tablero tablero = new Tablero();
    private String nombre, nombree;
    int i = 0;


    //Escribe el nombre de los 2 jugadores y llama al metodo de llenar tablero
    public JuegoBuscaminas(){

        System.out.println("Escribe el nombre del jugador 1");
        nombre = entrada.next();

        System.out.println("Escribe el nombre del jugador 2");
        nombree = entrada.next();
        
        tablero.llenar();
        tablero.actualizarTablero();

    }

    //Metodo publico para poder ejecutar el otro metodo privado
    public void run() {

        comenzarJuego();

    }

    //Metodo que comienza el juego
    private void comenzarJuego() {


        

        //Llama al metodo que llena el tablero
        tablero.mostrarTablero();

        //Bucle hasta que no haya ninguna mina o toques una
        do {
            Coordenada coordenada = preguntaDestapar();
            destapa(coordenada);
            tablero.mostrarTablero();

            //Contador para saber en que turno vas
            i = i+1;

        }while(!bombaDestapada() && quedanEspaciosLibres());
        
        escribeResultado();
    }

    //Metodo que te avisa cuando perdiste
    private void escribeResultado() {
        if(bombaDestapada()){

            //Si el turno es numero par, el jugador 2 perdio
            if(i%2 == 0){
                System.out.println("Ha perdido "+nombree);
            }else{
                System.out.println("Ha perdido "+nombre);
            }
        //Si no hay espacios ya ganaste
        }else if(!quedanEspaciosLibres()){
        System.out.println("Han ganado");
        }
    }

//Metodos de la clase Tablero
    private boolean quedanEspaciosLibres() {
        return tablero.quedanEspaciosLibres();

    }

    private boolean bombaDestapada() {

        return tablero.compruebaBombaDestapada();

    }

    private void destapa(Coordenada coordenada) {

        tablero.destapa(coordenada);

    }

    //Metood para destapar casilla
    private Coordenada preguntaDestapar() {

        Coordenada coordenada= new Coordenada(0,0);
        
        //Try para atrapar la excepcion

        try {

            //Bucle hasta que escribas una coordenda valida
            do {

                System.out.println("Que casillas quieres destapar?");
                
                //Entrada de las coordenadas (-1 porque empieza desde el 0)
                coordenada.setY((entrada.nextInt())-1);
                coordenada.setX((entrada.nextInt())-1);
                

            } while (!coordenadaEsValida(coordenada));
        }catch(InputMismatchException e){
            System.out.println("\nIntroduce unicamente numeros por favor\n");
            return preguntaDestapar();
        }

        //Regresa la coordenada
        return coordenada;

    }

    //Variable para saber si una coordenada es valida
    private boolean coordenadaEsValida(Coordenada coordenada) {

        boolean xCorrecta = coordenada.getX()>=0 && coordenada.getX()<tablero.getTamanioX();
        boolean yCorrecta = coordenada.getY()>=0 && coordenada.getY()<tablero.getTamanioY();

        return xCorrecta && yCorrecta && !casillaDestapada(coordenada);
    }

    private boolean casillaDestapada(Coordenada coordenada) {
        return tablero.getElemento(coordenada.getX(), coordenada.getY()).isDescubierto();
    }
   
    //Esto es un intento fallido de poner herencia.
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
        
    }

}