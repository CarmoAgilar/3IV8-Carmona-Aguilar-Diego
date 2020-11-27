//No quedo la herencia, ignore esto
public class J1 extends Gente{

    public J1(){
      
    }


    public J1(String nombre){
        

        super(nombre);
 
    }

  
    public void mostrarJ1(){
        System.out.println("Ha ganado " + getNombre());
    }
}
