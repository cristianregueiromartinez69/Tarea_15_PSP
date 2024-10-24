/**
 * Clase escritor que escribe en el buzón
 * @author cristian
 * @version 1.0
 */
public class Escritor implements Runnable{
    //variables de buzon y numero de escritores
    private Buzon buzon;
    private int numeroEscritores;

    /**
     * Contructor de la clase
     * @param buzon el objeto de tipo buzon
     * @param numeroEscritores el numero de escritores que habrá
     */
    public Escritor(Buzon buzon, int numeroEscritores){
        this.buzon = buzon;
        this.numeroEscritores = numeroEscritores;
    }


    /**
     * Método de ejecución del hilo
     * llamamos al método escribir que escribe en el buzón siempre y cuando esté vacío
     */
    @Override
    public void run() {

        for(int i = 0; i < numeroEscritores; i++){

            buzon.writeMailBox();

        }

    }
}
