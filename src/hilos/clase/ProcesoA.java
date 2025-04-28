package hilos.clase;

public class ProcesoA extends Thread {
    private int n;

    //Constructor
    public ProcesoA(int n){
        this.n=n;
    }

    public void contar (int n){
        for (int i=1; i <n;i++){
            System.out.println("Interaccion numero: " +i);
        }
    }

    @Override
    public void run() {
        for (int i=1; i <n;i++){
            System.out.println("Interaccion numero: " +i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
