public class Escritor implements Runnable{
    private Buzon buzon;

    public Escritor(Buzon buzon){
        this.buzon = buzon;
    }


    @Override
    public void run() {

        for(int i = 0; i < 10; i++){

            buzon.writeMailBox();
        }

    }
}
