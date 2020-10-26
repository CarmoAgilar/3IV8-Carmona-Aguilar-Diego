import java.util.Scanner; 
import java.util.*;

class Menu{

    public static void main(String[] args){ 
        Scanner entrada = new Scanner(System.in); 
        int base, altura, opcion, lado, edad, opcion1, i, x;
        int num;
        int suma=0;
        char letra; 
        double resultado;
        String binario = "";
        long factorial=1;
        do{
            System.out.println("Este menu fue hecho por Carmona Aguilar Diego");
            System.out.println("Grupo 3IV8");
            System.out.println("    ");
            System.out.println("Seleccione la opcion");

            System.out.println("1.- Calcular su abono");
            System.out.println("2.- Convertir decimal a binario");
            System.out.println("3.- Convertir temperaturas");
            System.out.println("4.- Contar numeros");
            System.out.println("5.- Calcular el precio de sus productos");
            System.out.println("6.- Medidas de figuras");
            System.out.println("7.- Tabla");
            System.out.println("8.- Factorial");
            System.out.println("9.- Calculadora");
            System.out.println("10.- Ir al final");
            opcion1 = entrada.nextInt();

            switch(opcion1){
            
                case 1:

                    System.out.println("Escribe tu edad: "); 
                    edad = entrada.nextInt();
                    System.out.println("Escribe el precio de tu abono: "); 
                    resultado = entrada.nextDouble();
                    
                    if (edad > 65){
                        resultado = resultado*0.6;
                        System.out.println("Debes pagar: "+resultado);
                    }
                    if(21 < edad & edad < 65){
                        System.out.println("Debes pagar: "+resultado);
                    }
                    if (edad < 21){
                        System.out.println("Si tus padres son socios selecciona 1. O si no lo son, preciona 2.");

                         opcion = entrada.nextInt();

                        switch (opcion){
                            case 1: 
                            resultado = resultado*.55;
                            System.out.println("El total a pagar es:"+resultado);

                            break;
                            case 2:
                            resultado = resultado*.75;
                            System.out.println("El total a pagar es: "+resultado);
                            break;
                        default:}
                    }
                    break;

                case 2:
                    System.out.println("Ingrese un numero en el sistema decimal positivo");
                    base = entrada.nextInt();
                    
                    
                        if (base > 0) {
                            while (base > 0) {
                                if (base % 2 == 0) {
                                    binario = "0" + binario;
                                } else {
                                    binario = "1" + binario;
                                }
                                base = (int) base / 2;
                            }
                        } else if (base == 0) {
                            binario = "0";
                        } else {
                            binario = "Ingrese solo numeros positivos";
                        }
                        System.out.println("Binario: "+binario);
                   

                    break;

                case 3:
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

                    break;

                case 4:
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
                
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de productos que compro");
                    x = entrada.nextInt();
                    for(i = 0;i < x;i++){ 
                    System.out.println("Escriba el precio");
                    suma = suma + Integer.parseInt(entrada.next());
                    }
            
                    System.out.println("La suma de los numeros es: "+suma);
                    break;                                                                                

                case 6:

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
                        default: }
                    break;
                case 7:
                    System.out.println("\tN\t\t\t");
                    System.out.println("\t1\t10\t100\t1000");
                    System.out.println("\t2\t20\t200\t2000");
                    System.out.println("\t3\t30\t300\t3000");
                    System.out.println("\t4\t40\t400\t4000");
                    System.out.println("\t5\t50\t500\t5000");
                    System.out.println("\t6\t60\t600\t6000");
                    System.out.println("\t7\t70\t700\t7000");
                    System.out.println("\t8\t80\t800\t8000");
                    System.out.println("\t9\t90\t900\t9000");
                    System.out.println("\t10\t100\t1000\t10000");
                        break;

                case 8:
                    System.out.print("Introduce un numero: ");
                    num = entrada.nextInt();
                    for (int r = num; r > 0; r--) {
                        factorial = factorial*r;
                    }
                    System.out.println("El factorial de "+num+" es: " +factorial);
                    break;

                case 9:
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
        
                        break;


                default:

                }
                System.out.println("¿Deseas volver al menu?, si lo desea escriba s"); 
                letra = entrada.next().charAt(0);    
        }while(letra == 's');
    }
}