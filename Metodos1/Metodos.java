//La mitad de los objetos tienen nombres aleatorios porque me quede sin nombres con sentido

//Escaners
import javax.swing.JOptionPane;


//clase
public class Metodos {

    public static void main(String[] args) {
       
        //Variable para repetir el menu
        int sino; 

     do{
        
 
        //Mi nombre
        String texto = JOptionPane.showInputDialog("Este menu fue hecho por Carmona Aguilar Diego\nGrupo 3IV8\nIntroduce el numero de la opcion\n1.-Calcular edad\n2.-Calcular areas y perimetros\n3.-Credito movil");
        
        //Convertir el string a entero para el switch

        int opcion = Integer.parseInt(texto);

        //Elegir la opcion que quiera
        //Nos vamos a los metodos de abajo

        switch (opcion) {
            case 1:
            Metodos edad1 = new Metodos();
                 
                edad1.edad1();

            break;

            case 2:
            Metodos figu = new Metodos();
                
                figu.figu();

            break;
           
            case 3:
            Metodos celu = new Metodos();
                
                celu.celu();

            break;


        }


            String num = JOptionPane.showInputDialog("Si desea repetir escriba 0");

            sino = Integer.parseInt(num);

            //Repetir menu

    }while(sino == 0);
    }

    //Metodo para la edad

    public void edad1(){
    
        int edad;
        int op11;
        do{
        String ano = JOptionPane.showInputDialog("Escriba el a\u00f1o de su nacimiento");

        int anoo = Integer.parseInt(ano);

        //No hay presupuesto para tanta letra "n" con raya arriba 

        String anooo = JOptionPane.showInputDialog("Escriba el a\u00f1o actual");

        int fecha = Integer.parseInt(anooo);

        //Resta la fecha de nacimiento a la actual 

        edad = fecha - anoo;
        
        String op = JOptionPane.showInputDialog("Tienes "+edad+" a\u00f1os de edad\nSi desea repetir el programa presione 0");

        op11 = Integer.parseInt(op);

        }while(op11 == 0);

        
    }

    //Metodo para las figuras

    public void figu(){

        String pp = JOptionPane.showInputDialog("Introduce el numero de la opcion que desea calcular\n1.-Calcular area de un cuadrado\n2.-Calcular perimetro de un cuadrado\n3.-Calcular area de un rectangulo\n4.-Calcular perimetro de un rectangulo\n5.-Calcular area de un triangulo\n6.-Calcular perimetro de un triangulo\n7.-Calcular area de un circulo\n8.-Calcular perimetro de un circulo");
        
        int figuop = Integer.parseInt(pp);

        //Elige la opcion de la figura

        switch(figuop){

            //Usamos un metodo para cada caso
            //En todas las figuras se hace lo mismo

            case 1:

            Metodos acua = new Metodos();
            acua.acua();

                break;
            case 2:

            Metodos pcua = new Metodos();
            pcua.pcua();

                break;
            case 3:

            Metodos arec = new Metodos();
            arec.arec();

                break;
            case 4:

            Metodos prec = new Metodos();
            prec.prec();

                break;
            case 5:

            Metodos atri = new Metodos();
            atri.atri();

                break;
            case 6:

            Metodos ptri = new Metodos();
            ptri.ptri();

                break;
            case 7:

            Metodos acir = new Metodos();
            acir.acir();

                break;
            case 8:

            Metodos pcir = new Metodos();
            pcir.pcir();

                break;
        }

    }
        //Metodos para cada opcion

            public void acua(){
            
                double area1;
                int op12;

                do{

                String base1 = JOptionPane.showInputDialog("Escriba la base del cuadrado");

                int base = Integer.parseInt(base1);

                area1 = base * base;
                
                //Se imprime el area

                String opp = JOptionPane.showInputDialog("El area es "+area1+"\nSi desea repetir el programa presione 0");

                    op12 = Integer.parseInt(opp);

                    //Opcion para repetir esto 

                }while(op12 == 0);
            }
            public void pcua(){
            
                double peri1;
                int op77;

                do{


                String pepepe = JOptionPane.showInputDialog("Escriba la base del cuadrado");

                int lado = Integer.parseInt(pepepe);

                peri1 = lado * 4;
                
                String opp = JOptionPane.showInputDialog("El perimetro es "+peri1+"\nSi desea repetir el programa presione 0");

                    op77 = Integer.parseInt(opp);

                }while(op77 == 0);
            }
            public void arec(){
            
                int area2;
                int op76;

                do{

                String basee = JOptionPane.showInputDialog("Escriba la base del rectangulo");

                int basi = Integer.parseInt(basee);

                String basie = JOptionPane.showInputDialog("Escriba la altura del rectangulo");

                int altu = Integer.parseInt(basie);

                area2 = basi * altu;
                
                String oppp = JOptionPane.showInputDialog("El area es "+area2+"\nSi desea repetir el programa presione 0");

                    op76 = Integer.parseInt(oppp);

                }while(op76 == 0);
            }
            public void prec(){
            
                double peri2;
                int opopo;

                do{

                String papure = JOptionPane.showInputDialog("Escriba la base del rectangulo");

                int morir = Integer.parseInt(papure);

                String ayudamedios = JOptionPane.showInputDialog("Escriba la altura del rectangulo");

                int mona = Integer.parseInt(ayudamedios);

                peri2 = morir * 2 + mona * 2;
                
                String papapure = JOptionPane.showInputDialog("El perimetro es "+peri2+"\nSi desea repetir el programa presione 0");

                    opopo = Integer.parseInt(papapure);

                }while(opopo == 0);
            }
            public void atri(){
            
                double area3;
                int papopipo;

                do{

                String baseuu = JOptionPane.showInputDialog("Escriba la base del triangulo");

                int bubu = Integer.parseInt(baseuu);

                String baseuuu = JOptionPane.showInputDialog("Escriba la altura del triangulo");

                int altutu = Integer.parseInt(baseuuu);

                area3 = (bubu * altutu)/2;
                
                String mamamia = JOptionPane.showInputDialog("El area es "+area3+"\nSi desea repetir el programa presione 0");

                    papopipo = Integer.parseInt(mamamia);

                }while(papopipo == 0);
            }
            public void ptri(){
            
                double peri3;
                int odiomivida;

                do{

                String xaxa = JOptionPane.showInputDialog("Escriba un lado del triangulo");

                int lado1 = Integer.parseInt(xaxa);

                String xrxr = JOptionPane.showInputDialog("Escriba el otro lado del triangulo");

                int lado2 = Integer.parseInt(xrxr);

                String xtxt = JOptionPane.showInputDialog("Escriba el ultimo lado del triangulo");

                int lado3 = Integer.parseInt(xtxt);

                peri3 = lado1 + lado2 + lado3;
                
                String opp = JOptionPane.showInputDialog("El perimetro es "+peri3+"\nSi desea repetir el programa presione 0");

                    odiomivida = Integer.parseInt(opp);

                }while(odiomivida == 0);
            }
            public void acir(){
            
                double area4;
                int sufrimiento;

                do{

                String wewewe = JOptionPane.showInputDialog("Escriba el radio del circulo");

                int radio = Integer.parseInt(wewewe);

                area4 = radio * radio * 3.1416;
                
                String mimimi = JOptionPane.showInputDialog("El area es "+area4+"\nSi desea repetir el programa presione 0");

                    sufrimiento = Integer.parseInt(mimimi);

                }while(sufrimiento == 0);
            }
            public void pcir(){
            
                double peri4;
                int oooo;

                do{

                String desua = JOptionPane.showInputDialog("Escriba el radio del circulo");

                int radio2 = Integer.parseInt(desua);

                peri4 = radio2 * 2 * 3.1416;
                
                String ropopoi = JOptionPane.showInputDialog("El area es "+peri4+"\nSi desea repetir el programa presione 0");

                    oooo = Integer.parseInt(ropopoi);

                }while(oooo == 0);
            }

    //Metodo para ver tu deuda por evasion de impuestos
    
    public void celu(){

        int opkk;
        double suma, resta;
        
        //variables para mostrar el costo y el restante de credito

        do{

            String suicidio = JOptionPane.showInputDialog("Escriba cuanto credito tiene");

            int credito = Integer.parseInt(suicidio);

            String aaaaa = JOptionPane.showInputDialog("Escriba cuantas llamadas internacionales hizo");

            int inte = Integer.parseInt(aaaaa);

            String tex1 = JOptionPane.showInputDialog("Escriba cuantas llamadas nacionales hizo");

            int naci = Integer.parseInt(tex1);

            String tex2 = JOptionPane.showInputDialog("Escriba cuantas llamadas a celulares hizo");

            int movil = Integer.parseInt(tex2);

            suma = inte * 0.6+naci*0.5+movil*0.2;

            //Suma del costo de las llamadas 

            resta = credito - suma;

            //Credito restante
                    
            String aaa = JOptionPane.showInputDialog("Usted debe "+suma+" de llamadas\nLe queda "+resta+" de saldo\nSi desea repetir el programa presione 0");

                opkk = Integer.parseInt(aaa);

        }while(opkk == 0);

        //Se repite todo si se pone 0
    }
}            