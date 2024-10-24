import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Buzon donde se lee y se escribe
 * @author cristian
 * @version 1.0
 */
public class Buzon {

    //variable con el mensaje a escribir
    private String mensaje = "";

    /**
     * Método sincronizado que escribe en el buzón
     */
    public synchronized void writeMailBox() {

        //mientras el mensaje sea diferente de vacío, es decir, el buzón esté lleno
        while (!mensaje.isEmpty()) {
            try {
                //esperas a que se vacíe
                wait();
            } catch (InterruptedException e) {
                System.out.println("Ups, ha ocurrido un error al escribir en el buzon");
            }
        }
        /**
         * Si está vacío, escribimos un mensaje
         */
        mensaje = JOptionPane.showInputDialog("Introduce un mensaje");
        //si no se escribe nada, escribimos algo nosotros para que no rompa el programa
        if(mensaje.isEmpty()){
            mensaje = "Que tenga usted un bien día";
        }
        System.out.println("Mensaje añadido al buzón");
        //notificamos a el resto de hilos que ya pueden hacer otras operaciones
        notifyAll();

    }

    /**
     * Método para leer del buzón
     */
    public synchronized void ReadMailBox() {

        //si el buzón está vacío, no puedes leer, por tanto esperas
        while (mensaje.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Ups, ha ocurrido un error al escribir en el buzon");
            }
        }
        //si no está vacío, lees el mensaje
        System.out.println("mensaje del buzón leído: " + mensaje + "\nBuzón vacío");
        //ponemos la variable nula y notificamos al escritor
        mensaje = "";
        notifyAll();

    }





}
