package hilos.clase;

public class ProcesoD implements Runnable{
    /*public void Signos () {
        for(int i=1; i<=100;i++){
            System.out.println(i+"*");
        }
    }

    @Override
    public void run() {
        Signos();
    }*/
    private int n;
    public ProcesoD(int numero){
        n=numero;
    }
    public void Signos (int n) {
        for(int i=1; i<=n;i++){
            System.out.println("*********************");
        }
    }

    @Override
    public void run() {
        Signos(n);
    }
}
