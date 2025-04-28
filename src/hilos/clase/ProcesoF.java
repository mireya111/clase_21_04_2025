package hilos.clase;

import hilos.vista.Ventana;

import javax.swing.*;

public class ProcesoF implements Runnable {

    public void Pantallas(){
        Ventana v = new Ventana();
        v.setVisible(true);
    }

    @Override
    public void run() {
        Pantallas();
    }
}
