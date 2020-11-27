//No quedo la herencia, ignore esto
public class J2 extends Gente{

    public J2(){
      
    }


    public J2(String nombre){
        

        super(nombre);
 
    }

  
    public void mostrarJ2(){
        System.out.println("Ha ganado " + getNombre());
    }
}
