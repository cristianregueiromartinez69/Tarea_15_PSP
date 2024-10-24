/**
 * Clase main donde ejecutamos el programa
 * @Author cristian
 * @version 1.0
 */
public class Main {
    //variable compartida del numero de lectores y escritores del buzon
    private static final int numeroLectoresEscritores = 10;
    public static void main(String[] args) {

        //hacemos el objecto de tipo buzon que será el mismo para el lector y escritor
        Buzon buzon = new Buzon();
        //llamamos a los 2 hilos pasandole por parametro el buzon y el numero
        Thread hiloLector = new Thread(new Lector(buzon, numeroLectoresEscritores));
        Thread hiloEscritor = new Thread(new Escritor(buzon, numeroLectoresEscritores));

        //iniciamos los hilos
        hiloLector.start();
        hiloEscritor.start();


    }
}