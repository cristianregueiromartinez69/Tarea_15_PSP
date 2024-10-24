public class Escritor implements Runnable{
    private Buzon buzon;
    private int numeroEscritores;

    public Escritor(Buzon buzon, int numeroEscritores){
        this.buzon = buzon;
        this.numeroEscritores = numeroEscritores;
    }


    @Override
    public void run() {

        for(int i = 0; i < numeroEscritores; i++){

            buzon.writeMailBox();

        }

    }
}
