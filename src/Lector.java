public class Lector implements Runnable{

    private Buzon buzon;
    private int numeroLectores;

    public Lector(Buzon buzon, int numeroLectores){
        this.buzon = buzon;
        this.numeroLectores = numeroLectores;
    }


    @Override
    public void run() {

        for(int i = 0; i < numeroLectores; i++){

            buzon.ReadMailBox();

        }

    }


}
