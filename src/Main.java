public class Main {
    public static void main(String[] args) {

        Buzon buzon = new Buzon();

        Thread hiloLector = new Thread(new Lector(buzon));
        Thread hiloEscritor = new Thread(new Escritor(buzon));

        hiloLector.start();
        hiloEscritor.start();


    }
}