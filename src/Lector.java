public class Lector implements Runnable{

    private Buzon buzon;

    public Lector(Buzon buzon){
        this.buzon = buzon;
    }


    @Override
    public void run() {

        for(int i = 0; i < 10; i++){

            buzon.ReadMialBox();
        }

    }


}
