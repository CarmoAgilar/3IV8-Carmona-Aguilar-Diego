public class Celda {

    //Encapsulamiento de datos
    private boolean bomba;
    private boolean descubierto=false;
    private int bombasVecinas=0;
    private Coordenada posicion;


    public Celda(boolean bomba, Coordenada posicion) {
        this.bomba = bomba;
        this.posicion= posicion;
    }

    public Celda(boolean bomba, boolean descubierto, Coordenada posicion) {
        this.bomba = bomba;
        this.descubierto = descubierto;
        this.posicion = posicion;
    }

    public boolean isBomba() {
        return bomba;
    }

    public boolean isDescubierto() {
        return descubierto;
    }

    public int getBombasVecinas() {
        return bombasVecinas;
    }

    public void setDescubierto(boolean descubierto) {
        this.descubierto = descubierto;
    }

    public void setBombasVecinas(int bombasVecinas) {
        this.bombasVecinas = bombasVecinas;
    }


    public Coordenada getPosicion() {
        return posicion;
    }

    public void sumaBombaVecina() {
        this.setBombasVecinas(this.getBombasVecinas()+1);
    }


    //Muestra la mina que tocaste y las casillas no destapadas
    public void imprime() {

        if(isDescubierto()) {
            if (isBomba()){
                System.out.print("*");
            }else {
                System.out.print(getBombasVecinas());
            }
        }
        else{
            System.out.print("#");
        }
    }
}