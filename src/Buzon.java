import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Buzon {

    private String mensaje = "";

    public synchronized void writeMailBox() {

        while (!mensaje.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Ups, ha ocurrido un error al escribir en el buzon");
            }
        }
        mensaje = JOptionPane.showInputDialog("Introduce un mensaje");
        if(mensaje.isEmpty()){
            mensaje = "Que tenga usted un bien día";
        }
        System.out.println("Mensaje añadido al buzón");
        notifyAll();

    }

    public synchronized void ReadMailBox() {

        while (mensaje.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Ups, ha ocurrido un error al escribir en el buzon");
            }
        }
        System.out.println("mensaje del buzón leído: " + mensaje + "\nBuzón vacío");
        mensaje = "";
        notifyAll();

    }





}
