import java.util.*;
public class Arreglos {
   int m;
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        char letra;
        int opcion;
                   
      do{
        System.out.println("    ");
        System.out.println("Este menu fue hecho por Carmona Aguilar Diego");
        System.out.println("Grupo 3IV8");
        System.out.println("    ");
        System.out.println("Seleccione la opcion");
        System.out.println("1.-Negativos, positivos y promedio");
        System.out.println("2.-Leer 10 numeros en posiciones pares");
        System.out.println("3.-Leer calificaciones");
        System.out.println("4.-leer 2 matrices y sumarlas");

       
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
            Arreglos prom = new Arreglos();
                 
                prom.prom();

            break;

            case 2:
            Arreglos prompar = new Arreglos();
                
                prompar.prompar();

            break;
           
            case 3:
            Arreglos calif = new Arreglos();
                
                calif.calif();

            break;

            case 4:
            Arreglos matriz = new Arreglos();
                
                matriz.matriz();

            break;

        }

            System.out.println("¿Deseas volver al menu?, si lo desea escriba s");

            letra = entrada.next().charAt(0);
            }while(letra == 's');
    }



                public void prom(){
            
                 Scanner entrada = new Scanner(System.in);
                    int i;
                    int pos = 0, neg = 0; 
                    int[] numeros = new int[10]; 
                    double sumaPos = 0, sumaNeg = 0;               
                    
                   
                    System.out.println("Escriba sus 10 numeros: ");
                    for (i = 0; i < 10; i++) {
                        System.out.print("numero "+(i + 1)+" : ");
                        numeros[i]=entrada.nextInt();
                    }
            
                    
                    for (i = 0; i < 10; i++) {
                        if (numeros[i] > 0){ 
                            sumaPos += numeros[i];
                            pos++;
                        } else if (numeros[i] < 0){ 
                            sumaNeg += numeros[i];
                            neg++;
                        }
                    }
            
                   
                    if (pos != 0) {
                        System.out.println("promedio de los valores positivos: " + sumaPos / pos);                
                    } else {
                        System.out.println("No ha introducido numeros positivos");
                    }
                    if (neg != 0) {
                        System.out.println("promedio de los valores negativos: " + sumaNeg / neg);
                    } else {
                        System.out.println("No ha introducido numeros negativos");
                    }
                }
                
                public void prompar(){
                    Scanner entrada = new Scanner(System.in);
                    int i;
                    int[] numeros = new int[10];
                    double promedio = 0;
            
                   
                    System.out.println("Escriba sus 10 numeros: ");
                    for (i = 0; i < 10; i++) {
                        System.out.print("numero "+(i + 1)+" : ");
                        numeros[i] = entrada.nextInt();
                    }
                    
                   
                    for (i = 0; i < 10; i++) {
                        if ((i+1) % 2 == 0){ 
                            promedio = promedio + numeros[i];
                        }
                    }
                   
                    System.out.println("Promedio de los numeros en posiciones pares: "+ promedio/5);           
                }

                public void calif(){
                    Scanner entrada = new Scanner(System.in);
                    int i, mejores = 0;
                    int aprobados = 0;
                    int reprobados = 10;
                    double suma = 0;
                    double promedio, mas = 0;
                    double menos = 10; 
                    
                    double[] calif = new double[10];
                    
                    for (i = 0; i < calif.length; i++) {
                        System.out.print("Alumno " + (i + 1) + " calificacion final: ");
                        calif[i] = entrada.nextDouble();
                    }
            
                    for (i = 0; i < calif.length; i++) {
                        suma = suma + calif[i];
                    }
            
                    promedio = suma / calif.length;
                    
                    System.out.println("    ");
                    System.out.println("Lista de todas las calificaciones:");

                    for (i = 0; i < calif.length; i++) {
                       
                            System.out.println("Alumno numero " + (i + 1)+ " calificacion final: " + calif[i]);
                    }
                    System.out.println("    ");
                    System.out.println("Calificacion promedio: "+promedio);
                    System.out.println("    ");
                    
                   for(i = 0; i < calif.length; i++) {
                       if (calif[i] > promedio) {
                        mejores = mejores + 1;
                       }

                   }
                    System.out.println("Hubo "+mejores+" calificaciones superiores al promedio");

                    for(i = 0; i < calif.length; i++) {
                        if (calif[i] >= 6 ) {
                            aprobados = aprobados + 1;
                            
                        }
                    }
                    reprobados = reprobados - aprobados;
                    System.out.println("    ");
                    System.out.println("Hubo "+aprobados+" alumnos aprobados  y "+reprobados+" alumnos reprobados");

                    for(i = 0; i < calif.length; i++) {
                        if(calif[i] <= menos) { 
                            menos = calif[i];
                        }
                        if(calif[i] > mas) {
                            mas = calif[i]; 
                        }
                    }
                    System.out.println("    ");
                    System.out.println("La calificacion mas alta fue de "+mas+" y la mas baja fue "+menos);
                    System.out.println("    ");
                }

                public void matriz(){
                    Scanner entrada = new Scanner(System.in);
                    int matrizA[][] = new int [3][3];
                    int matrizB[][] = new int [3][3];
                    int sumas [][] = new int[matrizA.length][matrizA.length];

                    float arreglos=0;
                    for(int i=0; i<matrizA.length; i++){
                        for(int j=0; j<matrizA.length; j++){
                            System.out.println("Ingresa el numero de la fila "+(i + 1)+" columna "+(j + 1)+" de la matriz a: ");
                            matrizA[i][j] = entrada.nextInt();
                            
                            }
                    }
                    for(int i=0; i<matrizB.length; i++){
                        //columnas
                        for(int j=0; j<matrizB.length; j++){
                            System.out.println("Ingresa el numero de la fila "+(i + 1)+" columna "+(j + 1)+" de la matriz b: ");
                            matrizB[i][j] = entrada.nextInt();
                        }
                            
                    }
                    int[][] suma = new int[matrizA.length][matrizA[0].length];
                    for (int i=0; i < matrizA.length; i++) {
                    for (int j=0; j < matrizA[i].length; j++) {				
                    suma[i][j]=matrizA[i][j]+matrizB[i][j];		

                    }

                    }
                    for (int i=0; i < sumas.length; i++) {
                    System.out.print("|");
                    for (int j=0; j < suma[i].length; j++) {
                    System.out.print (suma[i][j]);
                    if (j!=suma[i].length-1) System.out.print("\t");
                    }
                    System.out.println("|");
                    }
                }
                    
            }