import javax.swing.*;
import java.util.ArrayList;

public class Buzon {

    private String mensaje;
    private ArrayList<String> listaMensajes = new ArrayList<>();

    public synchronized void writeMialBox() {

        while (!listaMensajes.isEmpty()) {
            try {
                wait();
                System.out.println("Hilo escritor debe esperar a que elbuzón esté vacío");
            } catch (InterruptedException e) {
                System.out.println("Ups, ha ocurrido un error al escribir en el buzon");
            }
        }
        mensaje = JOptionPane.showInputDialog("Introduce un mensaje en el buzón");
        listaMensajes.add(mensaje);
        System.out.println("Mensaje añadido al buzón "  + "\nBuzón " + listaMensajes.size() + "/1");
        notifyAll();

    }

    public synchronized void ReadMialBox() {

        while (listaMensajes.isEmpty()) {
            try {
                wait();
                System.out.println("Hilo lector debe esperar a que  el buzón  no esté vacío");
            } catch (InterruptedException e) {
                System.out.println("Ups, ha ocurrido un error al escribir en el buzon");
            }
        }
        for(String mensaje:listaMensajes){
            JOptionPane.showMessageDialog(null, mensaje);
        }
        listaMensajes.clear();
        notifyAll();

    }



}
