package hilos.clase;

public class ProcesoB extends Thread {
    private String nombre;
    public  ProcesoB(String nombre){
        this.nombre = nombre;
    }
    public void saludar (String nombre) {
        System.out.println("Hola "+nombre);
    }

    @Override
    public void run() {
        saludar(nombre);
    }
}
