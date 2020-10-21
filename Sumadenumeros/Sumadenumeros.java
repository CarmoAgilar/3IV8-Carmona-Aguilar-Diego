import java.util.Scanner;

class Sumadenumeros{

    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);

        int num1, num2;
        int resultado=0;
        do{

        System.out.println("Ingresa el numero numero: ");
        
        num1 = entrada.nextInt();
        
        while(num1<0){

            System.out.println("Introduzca un valor positivo porfa");
            num1 = entrada.nextInt();
        }
        resultado = resultado + num1;

        }while(num1 != 0);
        
        System.out.println("La suma es de: "+resultado);
    }
}