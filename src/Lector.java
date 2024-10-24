/**
 * Clase lector que lee el mensaje del buzon
 * @author cristian
 * @version 1.0
 */
public class Lector implements Runnable{

    //variables privadas de tipo buzon y numero de lectores
    private Buzon buzon;
    private int numeroLectores;

    /**
     * Contructor de la clase
     * @param buzon el objeto de tipo buzon
     * @param numeroLectores el numero de lectores
     */
    public Lector(Buzon buzon, int numeroLectores){
        this.buzon = buzon;
        this.numeroLectores = numeroLectores;
    }


    /**
     * Método de ejecución del hilo
     * hacemos un for de tantas vuelta como numero de lectores haya y llamamos al metodo de lectura
     */
    @Override
    public void run() {

        for(int i = 0; i < numeroLectores; i++){

            buzon.ReadMailBox();

        }

    }


}
